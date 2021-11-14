package com.home;

import com.home.text.Task_1_2_Impl;
import com.home.text.TextFormatterImpl;

/**
 * Created by Егор on 11.11.2021.
 */
public class Main {
    public static void main(String[] args) {
        TextFormatterImpl textFormatter = new TextFormatterImpl();
        Task_1_2_Impl task_1_2 = new Task_1_2_Impl();
        System.out.println(task_1_2.cutSubstring("Hello world"));
        System.out.println(task_1_2.replacementCharacter("Hello world"));
        String[] palindromes = {"заказ", "поднос", "казак", "шашка", "дед"};
        System.out.println("Палиндромы: ");
        textFormatter.palindromesSearch(palindromes);
        String text = "Дед задумался.Шашка висела на стене больше десяти лет.Нужно снять ее и протереть.Здоровье подводит.";
        textFormatter.counterWord(text);

    }
}
