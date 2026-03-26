package Creational.AbstractFactory.Pizza.PizzaHut;

import Creational.AbstractFactory.Pizza.Pizza;

public class TomatoPizza implements Pizza {

    @Override
    public String getName(){
        return "Tomato Pizza from PizzaHut!!!";
    }
}
