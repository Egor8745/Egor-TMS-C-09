package home.clothes.pants;

/**
 * Created by Егор on 31.10.2021.
 */
public class NikePants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Надел штаны от Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны от Nike");
    }
}
