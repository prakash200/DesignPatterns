package Behavioural.Observer.Observers;

import Behavioural.Observer.BowlingEvent;

import java.util.concurrent.atomic.AtomicInteger;

public class OverObserver implements Observer {

    private final AtomicInteger over; // critical section for concurrency

    public OverObserver(){
        this.over = new AtomicInteger(0);
    }


    @Override
    public void update(BowlingEvent event){
        this.over.addAndGet(event.getBowl());
    }

    @Override
    public void display(){
        System.out.println("Current Overs = "+ this.over.get()/6+"."+this.over.get()%6);
    }
}
