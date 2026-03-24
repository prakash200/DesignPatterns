package Behavioural.Observer;

import Behavioural.Observer.Observers.Observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(BowlingEvent event);
    void display();
}
