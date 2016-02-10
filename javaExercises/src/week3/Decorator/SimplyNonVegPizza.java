package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class SimplyNonVegPizza implements Pizza {

    private double price = 5.5;
    private String desc = "SimplyNonVegPizza (" + price + ")";

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
