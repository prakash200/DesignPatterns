package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.IPizza;

public class TomatoPizza implements IPizza {

    @Override
    public String getName(){
        return "Tomato Pizza from PizzaHut!!!";
    }
}
