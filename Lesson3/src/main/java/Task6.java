import java.util.Random;

/**
 * Created by Егор on 07.10.2021.
 */
public class Task6 {
    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
    }

    public static void calculateSumOfDiagonalElements() {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - 1 - i];
        }

        System.out.println("Сумма элементов на диагонали равна: " + sum);
    }
}
