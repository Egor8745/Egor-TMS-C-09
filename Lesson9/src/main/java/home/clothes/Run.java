package home.clothes;


import home.clothes.jacket.AdidasJacket;
import home.clothes.jacket.IJacket;
import home.clothes.jacket.NikeJacket;
import home.clothes.pants.AdidasPants;
import home.clothes.pants.IPants;
import home.clothes.pants.NikePants;
import home.clothes.shoes.AdidasShoes;
import home.clothes.shoes.IShoes;
import home.clothes.shoes.NikeShoes;

/**
 * Created by Егор on 31.10.2021.
 */
public class Run {
    public static void main(String[] args) {
        IJacket adidasJacket = new AdidasJacket();
        IJacket nikeJacket = new NikeJacket();
        IPants adidasPants = new AdidasPants();
        IPants nikePants = new NikePants();
        IShoes adidasShoes = new AdidasShoes();
        IShoes nikeShoes = new NikeShoes();
        Human human = new Human("Леха", adidasJacket, nikePants, adidasShoes);
        System.out.println(human.getName() + ":");
        human.getDressed();
        human.undress();
    }
}
