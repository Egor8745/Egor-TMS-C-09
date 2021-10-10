/**
 * Created by Егор on 07.10.2021.
 */
public class Task3 {
    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static void main(String[] args) {
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 5, 3, 4, 5, 6}));
    }

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int odd = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
}
