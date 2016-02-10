package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class GreenOlives extends PizzaDecorator {

    public GreenOlives(Pizza pizza) {
        super(pizza.getPrice() + 0.8, pizza.getDesc() + ", GreenOlives (" + 0.8 + ")");
    }
}
