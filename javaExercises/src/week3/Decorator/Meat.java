package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class Meat extends PizzaDecorator {

    public Meat(Pizza pizza) {
        super(pizza.getPrice() + 1.5, pizza.getDesc() + ", Meat (" + 1.5 + ")");
    }
}
