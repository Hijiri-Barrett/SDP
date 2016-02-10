package week3.Factory;

/**
 * Created by hbarre03 on 19/01/2016.
 */
public class FactoryLauncher {

    public static void main(String[] args) {
        Product product = ConcreteCreator.newInstance().factory();

        System.out.println(product.toString());
    }
}
