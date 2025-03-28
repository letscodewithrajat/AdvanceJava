package com.rajat.wordgame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author rajatsrivastava
 **/
public class WordGuessingGame {
    private String wordToGuess;
    private char[] guessedLetter;
    private int attempts;
    public WordGuessingGame(String[] wordList, int maxAttempts) {
        this.wordToGuess = wordList[new Random().nextInt(wordList.length)];
        this.guessedLetter = new char[this.wordToGuess.length()];
        for (int i =0; i < this.guessedLetter.length; i++){
            this.guessedLetter[i] = '_';
        }
        this.attempts = maxAttempts;
    }

    public String play(){
      //  System.out.println("The word is: "+ wordToGuess);

        String result = "";
        Scanner scanner = new Scanner(System.in);
      //  boolean userHasWon = false;
      //  while (attempts > 0 && !userHasWon){
            while (attempts > 0 ){
            displayState();
            System.out.println("You have "+attempts+ " attempts left");
            System.out.print("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if(processGuess(guess)) {
                System.out.println("Correct!!");
                if (new String(guessedLetter).equals(wordToGuess)){
                    System.out.println("You have guessed the word! You win!");
                   // userHasWon = true;
                    return  "Won";
                }
            }else {
                System.out.println("That guess was incorrect!!");
            attempts--;
            }
        }
        /*if (!userHasWon){
            System.out.println("You are out of guesses! You lose!!!");
            result = "Lost";
        }*/
        return "Lost";
    }

    private boolean processGuess(char letter){
        boolean letterFound = false;
        for (int i =0; i < wordToGuess.length(); i ++){
           if(wordToGuess.charAt(i) == letter) {
               guessedLetter[i] = letter;
               letterFound = true;
           }
        }
        return letterFound;
    }

    private void displayState(){
        System.out.println("Guessed letters: " + new String(guessedLetter));

    }
}
