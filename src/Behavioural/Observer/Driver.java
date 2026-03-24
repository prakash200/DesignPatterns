package Behavioural.Observer;

import Behavioural.Observer.Observers.Observer;
import Behavioural.Observer.Observers.OverObserver;
import Behavioural.Observer.Observers.ScoreObserver;
import Behavioural.Observer.Observers.WicketObserver;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Observer design pattern CricBuzz application\n");
        // critical section optimization
        // AtomicInteger is used since it use compare and swap mechanism.
        // where multiple threads can read value at a time and only one writes at a time
        // by comparing with read value and actual. if read value!= actual value, then retry.

        Subject scoreBoard = new ScoreBoard();

        Observer scoreObserver = new ScoreObserver();
        Observer wicketObserver = new WicketObserver();
        Observer overObserver = new OverObserver();

        scoreBoard.addObserver(scoreObserver);
        scoreBoard.addObserver(wicketObserver);
        scoreBoard.addObserver(overObserver);

        scoreBoard.notifyObservers(new BowlingEvent(1,0, 6));
        System.out.println("Batsman hit the Six\n");
        scoreBoard.display();

        scoreBoard.notifyObservers(new BowlingEvent(0, 0,7));
        System.out.println("\n Bowler bowled no ball and batsman hit six\n");
        scoreBoard.display();

        scoreBoard.notifyObservers(new BowlingEvent(1, 1,0));
        System.out.println("\n Bowler took the wicket\n");
        scoreBoard.display();




    }
}
