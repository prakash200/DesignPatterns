package Creational.Factory;

import Creational.Factory.Pizza.*;

public class PizzaFactory {

    public Pizza getPizza(PizzaType type){
        return switch (type) {
            case ONION -> new OnionPizza();
            case TOMATO -> new TomatoPizza();
            case MARGARITA -> new MargeritaPizza();
            case CHICKEN -> new ChickenPizza();
            default -> throw new RuntimeException("Pizza type not found");
        };
    }
}
