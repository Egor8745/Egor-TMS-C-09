/**
 * Created by Егор on 07.10.2021.
 */
public class Task3 {
    //        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void main(String[] args) {
        char[][] array = new char[4][4];
        triangle(array);
    }

    public static void triangle(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
                if (j >= (array[i].length - i - 1)) {
                    array[i][j] = '*';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
                if (i >= j) {
                    array[i][j] = '*';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ' ';
                if (i <= j) {
                    array[i][j] = '*';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
                if (j >= (array[i].length - i)) {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}