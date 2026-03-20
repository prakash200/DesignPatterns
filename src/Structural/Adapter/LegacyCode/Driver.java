package Structural.Adapter.LegacyCode;

public class Driver {

    public static void main(String[] args){
        System.out.println("\nAdapter Pattern Legacy code Example\n");

        // Payment (Legacy Code) [ Adaptee ]
        // IPaymentProcessor [ Target ]
        // AdapterPayment [ Adapter ] , which implements Target interface and call legacy code
        IPaymentProcessor paymentProcessor = new AdapterPayment(new Payment());
        System.out.println(paymentProcessor.pay(100));
    }
}
