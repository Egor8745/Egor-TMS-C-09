/**
 * Created by Егор on 07.10.2021.
 */
public class Task4 {
    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     * <p>
     * count - количество программистов
     */
    public static void main(String[] args) {
        countDevs(19);
    }

    public static void countDevs(int count) {
        if (count <= 20) {
            if (count == 1) {
                System.out.println(count + " программист");
            } else if (count >= 2 && count <= 4) {
                System.out.println(count + " программиста");
            } else {
                System.out.println(count + " программистов");
            }
        } else if (count % 100 >= 11 && count % 100 <= 14) {
            System.out.println(count + " программистов");
        } else {
            if (count % 10 == 1)
                System.out.println(count + " программист");
            if (count % 10 >= 2 && count % 10 <= 4)
                System.out.println(count + " программиста");
            if ((count % 10 >= 5 && count % 10 <= 19) || count == 0)
                System.out.println(count + " программистов");
        }
    }
}
