package Behavioural.Strategy.PaymentMode.Payments;

public class PaypalPayment implements PaymentStrategy{

    @Override
    public void pay(Integer amount){
        System.out.println("Payment of "+amount+" has been paid via Paypal");
    }
}
