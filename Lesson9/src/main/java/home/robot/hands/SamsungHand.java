package home.robot.hands;

import home.robot.heads.IHead;

/**
 * Created by Егор on 31.10.2021.
 */
public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
