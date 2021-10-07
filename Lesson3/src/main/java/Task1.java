import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Егор on 04.10.2021.
 */
public class Task1 {
    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    public static void main(String[] args) {
        printArray();
    }

    private static void printArray() {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}













