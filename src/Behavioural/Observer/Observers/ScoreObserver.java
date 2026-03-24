package Behavioural.Observer.Observers;

import Behavioural.Observer.BowlingEvent;

import java.util.concurrent.atomic.AtomicInteger;

public class ScoreObserver implements Observer {

    private final AtomicInteger score;

    public ScoreObserver(){
        this.score = new AtomicInteger(0);  // critical section for concurrency
    }

    @Override
    public void update(BowlingEvent event){
        this.score.addAndGet(event.getScore());
    }

    @Override
    public void display(){
        System.out.println("Current Score = "+this.score);
    }
}
