package Creational.AbstractFactory;

import Creational.AbstractFactory.Dominos.DominosPizzaFactory;
import Creational.AbstractFactory.PizzaHut.PizzaHutPizzaFactory;

public class AbstractPizzaFactory {

    public static IPizzaFactory getPizzaFactory(StoreType type){

        return switch (type) {
            case DOMINOS -> new DominosPizzaFactory();
            case PIZZAHUT -> new PizzaHutPizzaFactory();
            default -> throw new RuntimeException("This Pizza Store is not Supported");
        };
    }
}
