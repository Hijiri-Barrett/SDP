package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class Spinach extends PizzaDecorator {

    public Spinach(Pizza pizza) {
        super(pizza.getPrice() + 1.0, pizza.getDesc() + ", Spinach (" + 1.0 + ")");
    }
}