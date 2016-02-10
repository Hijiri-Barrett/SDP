package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class Ham extends PizzaDecorator {

    public Ham(Pizza pizza) {
        super(pizza.getPrice() + 1.0, pizza.getDesc() + ", Ham (" + 1.0 + ")");
    }
}
