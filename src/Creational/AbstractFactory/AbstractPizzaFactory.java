package Creational.AbstractFactory;

import Creational.AbstractFactory.Pizza.*;
import Creational.AbstractFactory.PizzaFactory.*;
import Creational.AbstractFactory.enums.StoreType;

public class AbstractPizzaFactory {

    public static PizzaFactory getPizzaFactory(StoreType type){

        return switch (type) {
            case DOMINOS -> new DominosPizzaFactory();
            case PIZZAHUT -> new PizzaHutPizzaFactory();
            default -> throw new RuntimeException("This Pizza Store is not Supported");
        };
    }
}
