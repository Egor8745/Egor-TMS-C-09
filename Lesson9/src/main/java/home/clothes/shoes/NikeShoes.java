package home.clothes.shoes;

/**
 * Created by Егор on 31.10.2021.
 */
public class NikeShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Надел обувь от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь от Nike");
    }
}
