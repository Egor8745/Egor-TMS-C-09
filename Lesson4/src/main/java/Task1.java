import java.util.Scanner;

/**
 * Created by Егор on 07.10.2021.
 */
public class Task1 {
    //         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество времени (в часах):");
        System.out.println("За это время амеб стало: " + divisionOfAmoeba(scanner.nextInt()));
    }

    public static int divisionOfAmoeba(int time) {
        int amoeba = 1;
        for (int i = 3; i <= time; i++) {
            if (i % 3 == 0) {
                amoeba *= 2;
            }
        }
        return amoeba;
    }
}
