package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.IPizza;
import Creational.AbstractFactory.IPizzaFactory;
import Creational.AbstractFactory.PizzaType;

public class DominosPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza getPizza(PizzaType type){

        return switch (type) {
            case ONION -> new OnionPizza();
            case TOMATO -> new TomatoPizza();
            case CHICKEN -> new ChickenPizza();
            default -> throw new RuntimeException("This Pizza type is not Supported");
        };
    }
}
