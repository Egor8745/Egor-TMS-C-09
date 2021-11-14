package com.home.text;

/**
 * Created by Егор on 13.11.2021.
 */
public class Task_1_2_Impl implements Task_1_2_Servise {
    @Override
    public char[] cutSubstring(String text) {
        int index1 = text.indexOf('l');
        int index2 = text.indexOf("wo");
        char[] dst = new char[index2 - index1];
        text.getChars(index1, index2, dst, 0);
        return dst;
    }

    @Override
    public String replacementCharacter(String text) {
        return text.replace('l', 'd');
    }
}
