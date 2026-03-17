package Creational.Factory;

public class PizzaFactory {

    public Pizza getPizza(PizzaType type){
        switch (type){
            case ONION:
                return new OnionPizza();
            case TOMATO:
                return new TomatoPizza();
            case MARGARITA:
                return new MargeritaPizza();
            case CHICKEN:
                return new ChickenPizza();
            default:
                throw new RuntimeException("Pizza type not found");
        }
    }
}
