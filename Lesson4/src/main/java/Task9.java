import java.util.Arrays;
import java.util.Random;

/**
 * Created by Егор on 09.10.2021.
 */
public class Task9 {
    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
    //        Пример: {0,3,46,3,2,1,2}
    //        Массив имеет повторяющиеся элементы 3, 2
    //        Пример: {0,34,46,31,20,1,28}
    //        Массив не имеет повторяющихся элементов
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        searchRepetition(array);
    }

    public static void searchRepetition(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Элемент " + array[j] + " повторяющийся");
                    ++count;
                }
            }
        }
        if (count == 0) {
            System.out.println("Массив не имеет повторяющихся элементов");
        }
    }
}
