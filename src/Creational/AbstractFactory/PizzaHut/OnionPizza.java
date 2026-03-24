package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.Pizza;

public class OnionPizza implements Pizza {

    @Override
    public String getName(){
        return "Onion Pizza from PizaHut is Ready!!!";
    }
}
