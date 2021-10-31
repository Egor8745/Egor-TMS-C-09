package home.clothes.jacket;

/**
 * Created by Егор on 31.10.2021.
 */
public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку от Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку от Adidas");
    }
}
