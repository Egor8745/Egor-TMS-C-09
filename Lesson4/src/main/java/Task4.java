import java.util.Scanner;

/**
 * Created by Егор on 08.10.2021.
 */
public class Task4 {
    //         4) В переменную записываем число.
    //        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
    //        Например, Введите число: 5
    //        "5 - это положительное число, количество цифр = 1"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        getnumber(number);
        if (number == 0) {
            System.out.println(number + " не является ни положительным, ни отрицательным числом, количество цифр = " + getnumber(number));
        } else if (number > 0) {
            System.out.println(number + " это положительное число, количество цифр = " + getnumber(number));
        } else {
            System.out.println(number + " это отрицательное число, количество цифр = " + getnumber(number));
        }
    }

    public static int getnumber(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
