package Structural.Facade.ApiGateWay;

public class Driver {

    public static void main(String[] args){
        System.out.println("\nFacade pattern\n");

        ApiGateWay apiGateWay = new ApiGateWay();
        System.out.println("Order has been placed\n");
        apiGateWay.placeOrder();
    }
}
