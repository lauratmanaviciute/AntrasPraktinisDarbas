package com.example.antraspraktinisdarbas.utils;

public class TextCounter {
    public static String getCharsCount(String inputString) {
        return String.valueOf(inputString.length());
    }

    public static String getWordsCount(String inputString) {
        String[] textArray = inputString.split(" ");
        return String.valueOf(textArray.length);
    }
}
