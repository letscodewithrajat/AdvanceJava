package com.rajat.wordgame;

import java.util.*;

/**
 * @author rajatsrivastava
 **/
public class App {
    public static void main(String[] args) {
        String[] arr = {"java", "programming", "class", "computer", "method"};
        Map<String, Integer> playerResultMap = new HashMap<>();
        playerResultMap.put("Won", 0);
        playerResultMap.put("Lost", 0);
        Scanner scanner = new Scanner(System.in);
        //WordGuessingGame game = new WordGuessingGame(Arrays.asList("java", "programming", "class", "computer", "method").toArray(new String[0]), 10);
       // WordGuessingGame game = new WordGuessingGame(arr, 10);
        char wannaPlayMore;
        do {
            WordGuessingGame game = new WordGuessingGame(arr, 10);
            String result = game.play();
            playerResultMap.put(result, playerResultMap.get(result) + 1);

            System.out.println("Current Score !!!");
            System.out.println(playerResultMap.toString());
            System.out.print("Do you want to play more?? (Y/N)? ");
            wannaPlayMore = scanner.nextLine().toLowerCase().charAt(0);


        } while (wannaPlayMore == 'y');

    }
}
