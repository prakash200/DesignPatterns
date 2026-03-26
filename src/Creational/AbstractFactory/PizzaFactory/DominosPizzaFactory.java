package Creational.AbstractFactory.PizzaFactory;

import Creational.AbstractFactory.Pizza.Dominos.ChickenPizza;
import Creational.AbstractFactory.Pizza.Dominos.OnionPizza;
import Creational.AbstractFactory.Pizza.Dominos.TomatoPizza;
import Creational.AbstractFactory.Pizza.Pizza;
import Creational.AbstractFactory.enums.PizzaType;

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
