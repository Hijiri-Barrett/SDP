package week3.Singleton;

public class SingletonLauncher {

    public static void main(String[] args) {
        MySingleton ms = MySingleton.getInstance();
        ms.doSomething();
    }
}