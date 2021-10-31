package home.clothes.pants;

/**
 * Created by Егор on 31.10.2021.
 */
public class AdidasPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны от Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны от Adidas");
    }
}
