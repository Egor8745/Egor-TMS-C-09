import java.util.Arrays;
import java.util.Random;

/**
 * Created by Егор on 09.10.2021.
 */
public class Task7 {
    //        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
    //        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
    //        Снова выведете массив на экран на отдельной строке.
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}

