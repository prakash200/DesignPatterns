package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.Pizza;

public class OnionPizza implements Pizza {

    @Override
    public String getName(){
        return "Onion Pizza from Dominos is ready!!!";
    }
}
