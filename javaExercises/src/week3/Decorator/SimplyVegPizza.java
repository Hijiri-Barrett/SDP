package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class SimplyVegPizza implements Pizza {

    private String desc = "Veggie pizza with ";
    private double price = 2.0;

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
