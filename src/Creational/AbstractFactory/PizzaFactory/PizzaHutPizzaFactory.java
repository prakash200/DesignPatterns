package Creational.AbstractFactory.PizzaFactory;

import Creational.AbstractFactory.Pizza.Pizza;
import Creational.AbstractFactory.Pizza.PizzaHut.ChickenPizza;
import Creational.AbstractFactory.Pizza.PizzaHut.OnionPizza;
import Creational.AbstractFactory.Pizza.PizzaHut.TomatoPizza;
import Creational.AbstractFactory.enums.PizzaType;

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
