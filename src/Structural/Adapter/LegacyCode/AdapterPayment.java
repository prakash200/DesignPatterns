package Structural.Adapter.LegacyCode;

public class AdapterPayment implements PaymentProcessor {

    private final Payment payment;

    public AdapterPayment(Payment payment){
        this.payment = payment;
    }

    @Override
    public  String pay(Integer amount){
        return payment.makePayment(amount);
    }
}
