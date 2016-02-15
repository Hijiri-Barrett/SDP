package week5.facade;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class TestFacadePattern {

    public static void main(String[] args) {

        ServerFacade sf = new ServerFacade();
        sf.start();
        sf.close();
    }




}
