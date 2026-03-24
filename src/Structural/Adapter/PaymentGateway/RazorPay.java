package Structural.Adapter.PaymentGateway;

public class RazorPay implements PaymentProcessor {

    @Override
    public String pay(Integer amount){
        return "Payment of " + amount + " Done via RazorPay";
    }
}
