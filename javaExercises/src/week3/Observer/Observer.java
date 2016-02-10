package week3.Observer;

/**
 * Created by Hijiri on 10/02/2016.
 */
public interface Observer {

    void update(String desc);

    void subscribe();

    void unSubscribe();
}
