package home.cosmodrome;

import java.util.Random;

/**
 * Created by Егор on 31.10.2021.
 */
public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        Random random = new Random();
        int count = random.nextInt(11);
        return count > 3 ? true : false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
