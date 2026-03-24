package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.Pizza;

public class ChickenPizza implements Pizza {

    @Override
    public String getName(){
        return "Chicken Pizza from PizzaHut is ready!!!";
    }
}
