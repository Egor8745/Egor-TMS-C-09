import java.util.Scanner;

/**
 * Created by Егор on 07.10.2021.
 */
public class Task2 {
    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменные a и b:");
        System.out.println("Результат умножения:" + summ(scanner.nextInt(), scanner.nextInt()));
        System.out.println(summ(0, 1));
        System.out.println(summ(7, 6));
        System.out.println(summ(3, 0));
        System.out.println(summ(3, -1));
        System.out.println(summ(-3, -1));
        System.out.println(summ(-3, 1));
    }

    public static int summ(int a, int b) {
        int result = 0;
        if (a < 0 && b < 0) {
            for (int i = 0; i < -a; i++) {
                result += -b;
            }
        } else if (a > 0) {
            for (int i = 0; i < a; i++) {
                result += b;
            }
        } else if (a < 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        }
        return result;
    }
}
