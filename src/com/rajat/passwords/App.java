package com.rajat.passwords;

/**
 * @author rajatsrivastava
 **/
public class App {
    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        int length = ui.getPasswordLength();
        boolean useLowercase = ui.useLowercase();
        boolean useUppercase = ui.useUppercase();
        boolean useNumbers = ui.useNumbers();
        boolean useSymbols = ui.useSymbols();



        PasswordGenerator gen = new PasswordGenerator();
        System.out.println(gen.generatePassword(length,useLowercase,useUppercase,useNumbers,useSymbols));
    }
}
