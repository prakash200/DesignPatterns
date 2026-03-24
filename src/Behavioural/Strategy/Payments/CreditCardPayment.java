package Behavioural.Strategy.Payments;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(Integer amount){
        System.out.println("Payment of "+amount+" has been paid via Credit card");
    }
}
