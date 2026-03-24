package Structural.Adapter.PaymentGateway;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Adapter pattern Payment gate integration example\n");
        PaymentProcessor razorPay = new RazorPay();
        System.out.println(razorPay.pay(100));

        // IPayment processor [ Target ]
        // Stripe [ Adaptee ]
        // AdapterPayment [ Adapter ]
        PaymentProcessor processor = new AdapterPayment(new Stripe());
        System.out.println(processor.pay(100));
    }

}
