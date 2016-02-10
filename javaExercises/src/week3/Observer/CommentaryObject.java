package week3.Observer;

import java.util.ArrayList;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class CommentaryObject implements Subject, Commentary {

    private ArrayList<Observer> subscribers;
    private String eventName;
    private String desc;

    public CommentaryObject(ArrayList<Observer> subscribers, String eventName) {
        this.subscribers = subscribers;
        this.eventName = eventName;
        this.desc = "";
    }

    @Override
    public void subscribeObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public String subjectDetails() {
        return null;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }
}
