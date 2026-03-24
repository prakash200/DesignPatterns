package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.Pizza;

public class ChickenPizza implements Pizza {

    @Override
    public String getName(){
        return ("Chicken Pizza from Dominos is ready!!!");
    }
}
