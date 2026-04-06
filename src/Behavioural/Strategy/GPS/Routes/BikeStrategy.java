package Behavioural.Strategy.GPS.Routes;

public class BikeStrategy implements RouteStrategy{

    public void buildRoute(String source, String destination){
        System.out.println("Route from source "  + source +" to destination "+destination+" is planned via Bike!!");
    }
}
