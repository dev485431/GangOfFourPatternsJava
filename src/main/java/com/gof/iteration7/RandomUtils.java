package com.gof.iteration7;

import java.util.Random;

public class RandomUtils {

    private RandomUtils() {
    }

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final int MAX_LENGTH = 25;


    public static String generateRandomString(String chars) {
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < MAX_LENGTH; i++) {
            int charIndex = new Random().nextInt(chars.length());
            randomString.append(chars.charAt(charIndex));
        }
        return randomString.toString();
    }

}
