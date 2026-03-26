package Creational.AbstractFactory.Pizza.Dominos;

import Creational.AbstractFactory.Pizza.Pizza;

public class ChickenPizza implements Pizza {

    @Override
    public String getName(){
        return ("Chicken Pizza from Dominos is ready!!!");
    }
}
