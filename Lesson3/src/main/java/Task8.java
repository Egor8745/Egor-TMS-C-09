/**
 * Created by Егор on 07.10.2021.
 */
public class Task8 {
    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void main(String[] args) {
        printPrimeNumbers();
    }

    public static void printPrimeNumbers() {
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 1; i < 1000; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(i + " ");
            }
        }
    }
}

