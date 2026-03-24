package Behavioural.Strategy;

import Behavioural.Strategy.Payments.PaymentStrategy;

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
