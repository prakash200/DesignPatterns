package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.Pizza;
import Creational.AbstractFactory.PizzaFactory;
import Creational.AbstractFactory.PizzaType;

public class DominosPizzaFactory implements PizzaFactory {

    @Override
    public Pizza getPizza(PizzaType type){

        return switch (type) {
            case ONION -> new OnionPizza();
            case TOMATO -> new TomatoPizza();
            case CHICKEN -> new ChickenPizza();
            default -> throw new RuntimeException("This Pizza type is not Supported");
        };
    }
}
