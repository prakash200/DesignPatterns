package Behavioural.Observer;

import Behavioural.Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Subject {

    private final List<Observer> observers;

    public ScoreBoard(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(BowlingEvent event){
        for (Observer observer: this.observers){
            observer.update(event);
        }
    }

    @Override
    public void display(){
        for (Observer observer : this.observers){
            observer.display();
        }
    }
}
