package com.home.streams;

import java.util.ArrayList;
import java.util.Objects;

public class TextFormatter {

    private TextFormatter() {
    }

    public static String getPalindromes(String str) {
        String[] sentences = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String s : sentences) {
            if (isWordPalindrome(s)) {
                result.append(s).append("\n");
            }
        }
        return result.toString();
    }

    public static String formatText(String text) {
        String[] sentences = text.split("[!.?]\\s*");
        ArrayList<String> arr = new ArrayList<>();
        for (String sentence : sentences) {
            int count = getWordsArray(sentence).length;
            if (count >= 3 && count <= 5 || checkPalindromeInSentence(sentence)) {
                arr.add(sentence);
            }
        }
        return String.valueOf(arr).replaceAll("-\\s*", "");
    }

    public static void checkCensor(String text, String text2) {
        String[] sentences = text.split("[!.?]\\s*");
        int count = 0;
        boolean var = false;
        for (String sentence : sentences) {
            if (sentence.contains(Objects.requireNonNull(censorWords(text2)))) {
                count++;
                var = true;
                System.out.println(sentence);
            }
        }
        if (var) {
            System.out.println("Количество предложений не прошедших цензуру = " + count);
        } else {
            System.out.println("Текст прошёл цензуру");
        }
    }

    public static String censorWords(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            return word;
        }
        return null;
    }

    public static String[] getWordsArray(String str) {
        return str.split(" ");
    }

    public static boolean checkPalindromeInSentence(String str) {
        for (String s : getWordsArray(str)) {
            if (s.length() > 2 && isWordPalindrome(s)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isWordPalindrome(String word) {
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
