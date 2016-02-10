package week3.Observer;

/**
 * Created by Hijiri on 10/02/2016.
 */
public interface Subject {

    void subscribeObserver(Observer observer);

    void unSubscribeObserver(Observer observer);

    void notifyObservers();

    String subjectDetails();
}
