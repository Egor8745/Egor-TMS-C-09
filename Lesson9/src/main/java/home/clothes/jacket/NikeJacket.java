package home.clothes.jacket;

/**
 * Created by Егор on 31.10.2021.
 */
public class NikeJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Надел куртку от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку от Nike");
    }
}
