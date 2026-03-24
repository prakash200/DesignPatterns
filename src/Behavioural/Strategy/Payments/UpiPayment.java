package Behavioural.Strategy.Payments;

public class UpiPayment implements PaymentStrategy{

    @Override
    public void pay(Integer amount){
        System.out.println("Payment of "+amount+" has been paid via UPI");
    }
}
