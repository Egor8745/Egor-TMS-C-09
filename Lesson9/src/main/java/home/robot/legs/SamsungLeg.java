package home.robot.legs;

/**
 * Created by Егор on 31.10.2021.
 */
public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг ногой Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
