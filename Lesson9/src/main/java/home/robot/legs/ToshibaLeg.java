package home.robot.legs;

/**
 * Created by Егор on 31.10.2021.
 */
public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг ногой Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
