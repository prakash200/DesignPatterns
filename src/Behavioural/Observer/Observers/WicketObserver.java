package Behavioural.Observer.Observers;

import Behavioural.Observer.BowlingEvent;

import java.util.concurrent.atomic.AtomicInteger;

public class WicketObserver implements Observer {

    private final AtomicInteger wickets; // critical section for concurrency

    public WicketObserver(){
        this.wickets = new AtomicInteger(0);
    }

    @Override
    public void update(BowlingEvent event){
        this.wickets.addAndGet(event.getWickets());

    }

    @Override
    public void display(){
        System.out.println("Current Wickets = "+this.wickets);
    }
}
