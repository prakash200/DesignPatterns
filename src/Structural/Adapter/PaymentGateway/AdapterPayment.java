package Structural.Adapter.PaymentGateway;

public class AdapterPayment  implements PaymentProcessor {

    private final Stripe stripe;

    public AdapterPayment(Stripe stripe){
        this.stripe = stripe;
    }

    @Override
    public String pay(Integer amount){
        return stripe.makePayment(amount);
    }
}
