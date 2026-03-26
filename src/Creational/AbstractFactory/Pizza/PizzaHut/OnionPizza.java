package Creational.AbstractFactory.Pizza.PizzaHut;

import Creational.AbstractFactory.Pizza.Pizza;

public class OnionPizza implements Pizza {

    @Override
    public String getName(){
        return "Onion Pizza from PizaHut is Ready!!!";
    }
}
