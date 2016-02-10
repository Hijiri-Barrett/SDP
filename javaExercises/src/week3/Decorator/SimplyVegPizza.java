package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class SimplyVegPizza implements Pizza {

    private double price = 5.0;
    private String desc = "SimplyVegPizza (" + price + ")";

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
