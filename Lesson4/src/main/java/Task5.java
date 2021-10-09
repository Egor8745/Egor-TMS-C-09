import java.util.Arrays;

/**
 * Created by Егор on 08.10.2021.
 */
public class Task5 {
    //        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
    //        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void main(String[] args) {
        int[] array = new int[50];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 1;
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        invertArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void invertArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}
