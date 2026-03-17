package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.PizzaHut.ChickenPizza;
import Creational.AbstractFactory.PizzaHut.OnionPizza;
import Creational.AbstractFactory.PizzaHut.TomatoPizza;
import Creational.AbstractFactory.IPizza;
import Creational.AbstractFactory.IPizzaFactory;
import Creational.AbstractFactory.PizzaType;

public class PizzaHutPizzaFactory implements IPizzaFactory {

    @Override
    public IPizza getPizza(PizzaType type){
        return switch (type) {
            case ONION -> new OnionPizza();
            case TOMATO -> new TomatoPizza();
            case CHICKEN -> new ChickenPizza();
        };
    }
}
