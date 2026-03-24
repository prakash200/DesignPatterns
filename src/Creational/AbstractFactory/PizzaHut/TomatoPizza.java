package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.Pizza;

public class TomatoPizza implements Pizza {

    @Override
    public String getName(){
        return "Tomato Pizza from PizzaHut!!!";
    }
}
