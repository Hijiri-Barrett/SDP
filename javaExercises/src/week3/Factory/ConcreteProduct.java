package week3.Factory;

/**
 * Created by hbarre03 on 19/01/2016.
 */
public class ConcreteProduct implements Product {

    public ConcreteProduct() {
        System.out.println("new ConcreteProduct");
    }

    @Override
    public String toString() {
        return "This is a product!";
    }
}
