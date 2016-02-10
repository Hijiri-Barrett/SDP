package week3.Decorator;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class SimplyNonVegPizza implements Pizza {

    private String desc = "Non-veggie pizza with ";
    private double price = 2.5;

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
