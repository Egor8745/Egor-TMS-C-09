import java.util.Arrays;

/**
 * Created by Егор on 09.10.2021.
 */
public class Task8 {
    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        int[] mass = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int indexMax = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= mass[indexMax]) {
                indexMax = i;
            }
        }
        replacement(mass, 0, indexMax);
    }

    public static void replacement(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}

