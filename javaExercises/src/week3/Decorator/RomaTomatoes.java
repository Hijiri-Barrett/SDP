package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class RomaTomatoes extends PizzaDecorator {

    public RomaTomatoes(Pizza pizza) {
        super(pizza.getPrice() + 1.2, pizza.getDesc() + ", RomaTomatoes (" + 1.2 + ")");
    }
}
