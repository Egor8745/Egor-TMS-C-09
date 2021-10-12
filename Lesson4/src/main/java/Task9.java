import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
        int[] array = new int[10];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        searchRepetition(array);
    }

    public static void searchRepetition(int[] array) {
        int count = 0;
        Set<Integer> foundStrings = new HashSet<Integer>();
        Set<Integer> duplicates = new HashSet<Integer>();
        for (int str : array) {
            if (foundStrings.contains(str)) {
                duplicates.add(str);
                count++;
            } else {
                foundStrings.add(str);
            }
        }
        if (count > 0) {
            System.out.println("Массив имеет повторяющиеся элементы: " + duplicates);
        } else {
            System.out.println(" Массив не имеет повторяющихся элементов");
        }
    }
}
