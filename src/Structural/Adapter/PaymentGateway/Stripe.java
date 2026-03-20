package Structural.Adapter.PaymentGateway;

public class Stripe {

    public String makePayment(Integer amount){
        return "Payment of "+amount+" has done via Stripe";
    }
}
