package home.cosmodrome;

/**
 * Created by Егор on 31.10.2021.
 */
public class Cosmodrome {
    public void launch() {
        IStart startShuttle = new Shuttle();
//startShuttle = (IStart) (!startShuttle.checkSystem() ? "Предстартовая проверка провалена»." : startShuttle.startEngine()); Такой вариант записи корректный?
        if (!startShuttle.checkSystem()) {
            System.out.println("Предстартовая проверка провалена.");
        } else {
            startShuttle.startEngine();
            System.out.println("Обратный отсчет: ");
            int i = 10;
            while (i >= 1) {
                System.out.print(i + " ");
                i--;
            }
            System.out.println();
            startShuttle.start();
        }
    }
}
