package Creational.AbstractFactory.Pizza.PizzaHut;

import Creational.AbstractFactory.Pizza.Pizza;

public class ChickenPizza implements Pizza {

    @Override
    public String getName(){
        return "Chicken Pizza from PizzaHut is ready!!!";
    }
}
