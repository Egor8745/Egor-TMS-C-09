package home.robot.legs;

/**
 * Created by Егор on 31.10.2021.
 */
public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг ногой Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
