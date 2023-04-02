package com.example.antraspraktinisdarbas.utils;

public class TextCounter {
    public static String getCharsCount(String inputString) {
        return String.valueOf(inputString.length());
    }

    public static String getWordsCount(String inputString) {
        String trimmedInput = inputString.trim();
        if (trimmedInput.isEmpty()) {
            return "0";
        }
        String[] textArray = trimmedInput.split("\\s+");
        return String.valueOf(textArray.length);
    }

}

