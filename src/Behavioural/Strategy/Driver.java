package Behavioural.Strategy;

import Behavioural.Strategy.Payments.CreditCardPayment;
import Behavioural.Strategy.Payments.PaymentStrategy;
import Behavioural.Strategy.Payments.UpiPayment;

public class Driver {

    public static void main(String[] args){
        System.out.println("\nStarategy Pattern\n");

        PaymentContext payment = new PaymentContext(new CreditCardPayment());
        payment.pay(100);
        payment.setStrategy(new UpiPayment());
        payment.pay(1000);
    }
}
