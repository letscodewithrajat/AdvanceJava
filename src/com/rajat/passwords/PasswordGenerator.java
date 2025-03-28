package com.rajat.passwords;

import java.util.Random;

/**
 * @author rajatsrivastava
 **/
public class PasswordGenerator {

    private boolean hasOverlap(String s1, String s2){
        for (char c : s1.toCharArray()){
            if (s2.contains(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }

    String generatePassword(int length, boolean useLowercase, boolean useUpperCase,
                            boolean useNumbers, boolean useSpecialCharacters) {

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = lowercase.toUpperCase();
        String digits = "0123456789";
        String symbols = "!@#$%^&*()?";

        StringBuilder charOptions = new StringBuilder();
        if (useLowercase) charOptions.append(lowercase);
        if (useUpperCase) charOptions.append(uppercase);
        if (useNumbers) charOptions.append(digits);
        if (useSpecialCharacters) charOptions.append(symbols);
        String allChars = charOptions.toString();
        boolean passwordIsValid = false;
        while (true){
            Random random = new Random();
            StringBuilder password = new StringBuilder();
            for (int i = 0; i < length; i++) {
                char nextLetter = allChars.charAt(random.nextInt(allChars.length()));
                password.append(nextLetter);
            }
            String pass = password.toString();
            passwordIsValid = true;
            if (useLowercase && !hasOverlap(pass, lowercase)){
                passwordIsValid =false;
            }
            if (useUpperCase && !hasOverlap(pass, uppercase)){
                passwordIsValid =false;
            }
            if (useNumbers && !hasOverlap(pass, digits)){
                passwordIsValid =false;
            }
            if (useSpecialCharacters && !hasOverlap(pass, symbols)){
                passwordIsValid =false;
            }

            if(passwordIsValid){
                return pass;
            }
            System.out.println("Password failed, trying again !!!");
        }


    }
}
