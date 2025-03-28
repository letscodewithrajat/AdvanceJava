package com.rajat.dice;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author rajatsrivastava
 **/
public class Simulator {
    public static void main(String[] args) {
        System.out.println(":Welcome to the Dice Simulator:");
        Scanner scanner = new Scanner(System.in);

        boolean appCompleted = false;

        do {
            try {
                System.out.println("How many dice would you like to roll? Enter 0 to exit :- ");
                int numberOfDice = scanner.nextInt();
                appCompleted = true;
                System.out.println("About to roll " + numberOfDice + "dice");
                Random random = new Random();
                for (int i = 0; i < numberOfDice; i++) {
                    int rolledNumber = random.nextInt(6) + 1;
                    System.out.println(display(rolledNumber));
                }
                System.out.println("Entered 0. Exiting the game.");
            } catch (InputMismatchException e) {
                System.out.println("That is not a valid number. Please Try again !!!");
                scanner.next();
            }
        } while (!appCompleted);


        //Random random = new Random();
        //System.out.println(random.nextDouble());
        //System.out.println(random.nextInt());
        //System.out.println(random.nextInt(4)); //0 inclusive 4 exclusive

    }

    static String display(int value) {
        /*switch (value) {
            case 1:  return  "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2:  return  "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3:  return  "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4:  return  "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5:  return  "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6:  return  "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default: return "Not a valid die value";
            }*/

        return switch (value) {
            case 1 -> "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2 -> "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3 -> "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4 -> "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5 -> "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6 -> "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default -> "Not a valid die value";
        };
    }
}
