package home.clothes;

import home.clothes.jacket.IJacket;
import home.clothes.pants.IPants;
import home.clothes.shoes.IShoes;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Егор on 31.10.2021.
 */
@AllArgsConstructor
@Getter
public class Human {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
