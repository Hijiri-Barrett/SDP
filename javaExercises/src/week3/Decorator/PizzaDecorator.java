package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public abstract class PizzaDecorator implements Pizza {

    private double price;
    private String desc;

    public PizzaDecorator(double price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
