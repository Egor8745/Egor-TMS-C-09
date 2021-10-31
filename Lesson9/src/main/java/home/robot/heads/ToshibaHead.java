package home.robot.heads;

/**
 * Created by Егор on 31.10.2021.
 */
public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
