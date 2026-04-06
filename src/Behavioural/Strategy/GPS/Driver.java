package Behavioural.Strategy.GPS;

import Behavioural.Strategy.GPS.Routes.BikeStrategy;
import Behavioural.Strategy.GPS.Routes.BusStrategy;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Strategy Pattern GPS route bike/car/bus\n");

        GpsContext strategy = new GpsContext(new BikeStrategy());
        strategy.buildRoute("A","B");

        strategy.setStrategy(new BusStrategy());
        strategy.buildRoute("B","C");



    }
}
