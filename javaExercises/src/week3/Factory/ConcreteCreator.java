package week3.Factory;

/**
 * Created by hbarre03 on 19/01/2016.
 */
public class ConcreteCreator implements Creator {

    private static Creator INSTANCE;

    private ConcreteCreator() {
        System.out.println("new ConcreteCreator");
    }

    static {
        INSTANCE = new ConcreteCreator();
    }

    @Override
    public Product factory() {
        System.out.println("ConcreteCreator.factory()");
        return new ConcreteProduct();
    }

    public static Creator newInstance() {
        return INSTANCE;
    }
}
