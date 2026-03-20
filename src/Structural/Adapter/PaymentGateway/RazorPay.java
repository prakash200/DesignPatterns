package Structural.Adapter.PaymentGateway;

import Structural.Adapter.PaymentGateway.IPaymentProcessor;

public class RazorPay implements IPaymentProcessor {

    @Override
    public String pay(Integer amount){
        return "Payment of " + amount + "Done via RazorPay";
    }
}
