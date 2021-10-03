import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Егор on 01.10.2021.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(549, 120));
        System.out.println(average(new int[]{1, 2, 3, 4, 6}));
        System.out.println(max(new int[]{1, 2, 3, 105, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    public static long sum(long a, long b) {
        long result = a + b;
        if (result > Integer.MAX_VALUE){     //не придумал другого способа борьбы с арифметическим переполнением int для выполнения доп. условия, кроме как изменить условие задачи.. нужна подсказка.
            return -1;
        }
        return result;
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static double average(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double result = sum / array.length;
        return result;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double calculateHypotenuse(int a, int b) {
        double hypotenuse = Math.sqrt(a * a + b * b);
        return hypotenuse;
    }
}

