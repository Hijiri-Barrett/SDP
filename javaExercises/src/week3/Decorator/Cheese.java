package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza.getPrice() + 0.8, pizza.getDesc() + ", Cheese (" + 0.8 + ")");
    }
}
