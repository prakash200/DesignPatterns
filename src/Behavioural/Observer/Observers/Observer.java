package Behavioural.Observer.Observers;
import Behavioural.Observer.BowlingEvent;

public interface Observer {

    void update(BowlingEvent event);
    void display();

}
