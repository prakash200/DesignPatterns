package Behavioural.Strategy.PaymentMode;

import Behavioural.Strategy.PaymentMode.Payments.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void pay(Integer amount){
        this.strategy.pay(amount);
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }
}
