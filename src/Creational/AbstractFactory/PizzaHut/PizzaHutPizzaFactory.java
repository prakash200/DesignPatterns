package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.Pizza;
import Creational.AbstractFactory.PizzaFactory;
import Creational.AbstractFactory.PizzaType;

public class PizzaHutPizzaFactory implements PizzaFactory {

    @Override
    public Pizza getPizza(PizzaType type){
        return switch (type) {
            case ONION -> new OnionPizza();
            case TOMATO -> new TomatoPizza();
            case CHICKEN -> new ChickenPizza();
        };
    }
}
