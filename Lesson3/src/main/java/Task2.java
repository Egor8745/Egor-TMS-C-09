/**
 * Created by Егор on 07.10.2021.
 */
public class Task2 {
    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static void main(String[] args) {
        System.out.println(operation(-2));
        System.out.println(operation(0));
    }

    public static int operation(int number) {
        if (number > 0) {
            ++number;
        } else if (number < 0) {
            number = number - 2;
        } else {
            number = 10;
        }
        return number;
    }
}
