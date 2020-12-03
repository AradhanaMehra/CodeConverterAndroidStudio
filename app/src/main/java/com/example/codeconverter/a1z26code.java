package com.example.codeconverter;

import java.util.HashMap;

public class a1z26code {

    static String[] ALPHA = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "y", "z"};
    static String[] a1z26 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26"};

    public static HashMap<String, String> ALPHA_TO_a1z26 = new HashMap<>();
    public static HashMap<String, String> a1z26_TO_ALPHA = new HashMap<>();

    static {
        for (int i = 0; i < ALPHA.length && i < a1z26.length; i++) {
            ALPHA_TO_a1z26.put(ALPHA[i], a1z26[i]);
            a1z26_TO_ALPHA.put(a1z26[i], ALPHA[i]);
        }
    }

    public static String a1z26ToAlpha(String morseCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = morseCode.trim().split("   ");

        for (String word : words) {
            for (String letter : word.split(" ")) {
                String alpha = a1z26_TO_ALPHA.get(letter);
                builder.append(alpha);
            }

            builder.append(" ");
        }

        return builder.toString().toUpperCase();
    }

    public static String alphaToa1z26(String englishCode) {
        StringBuilder builder = new StringBuilder();
        String[] words = englishCode.trim().split(" ");

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String morse = ALPHA_TO_a1z26.get(word.substring(i, i + 1).toLowerCase());
                builder.append(morse).append(" ");
            }

            builder.append("  ");
        }

        return builder.toString();
    }
}

