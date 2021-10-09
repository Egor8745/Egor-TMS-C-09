import java.util.Random;

/**
 * Created by Егор on 09.10.2021.
 */
public class Task6 {
    //        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
    //        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
    //        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random random = new Random();
        int indexMax = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            System.out.print(mass[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= mass[indexMax]) {
                indexMax = i;
            }
        }
        System.out.println("Максимальный элемент " + mass[indexMax] + ", индекс его последнего вхождения в массив " + indexMax);
    }
}

