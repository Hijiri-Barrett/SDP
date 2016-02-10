package week3.Singleton;

public class MySingleton {

    private static class SingletonLoader {
        static MySingleton INSTANCE = new MySingleton();
    }

    private MySingleton() {};

    public static MySingleton getInstance() {
        System.out.println("MySingleton() loaded.");
        return SingletonLoader.INSTANCE;
    }

    public void doSomething() {
        System.out.println("Doing something.");
    }
}