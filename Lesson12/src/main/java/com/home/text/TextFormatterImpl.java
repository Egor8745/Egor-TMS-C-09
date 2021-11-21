package com.home.text;


/**
 * Created by Егор on 11.11.2021.
 */
public class TextFormatterImpl implements TexstServise {

    @Override
    public void counterWord(String text) {
        String[] words = text.split("[.]");
        palindromesSearch(words);
        for (String word : words) {
            String[] singleWords = word.split(" ");
            System.out.println();
            for (int i = 0; i < singleWords.length; i++) {
                if (singleWords.length >= 3 && singleWords.length <= 5) {
                    System.out.print(singleWords[i] + " ");
                }
            }
        }
    }

    @Override
    public void palindromesSearch(String[] words) {
        for (String palindromes : words) {
            if (searchPalindrome(palindromes)) {
                System.out.println(palindromes);
            }
        }
    }

    private boolean searchPalindrome(String words) {
        String[] singleWords = words.split(" ");
        for (String word : singleWords) {
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    return false;
                }
            }
        }
        return true;
    }
}



