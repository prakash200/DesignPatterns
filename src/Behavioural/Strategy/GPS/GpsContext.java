package Behavioural.Strategy.GPS;

import Behavioural.Strategy.GPS.Routes.RouteStrategy;

public class GpsContext {

    private RouteStrategy strategy;

    public GpsContext(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void buildRoute(String source , String destination){
        strategy.buildRoute(source,destination);
    }
}
