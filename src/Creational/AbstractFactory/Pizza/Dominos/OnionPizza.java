package Creational.AbstractFactory.Pizza.Dominos;

import Creational.AbstractFactory.Pizza.Pizza;

public class OnionPizza implements Pizza {

    @Override
    public String getName(){
        return "Onion Pizza from Dominos is ready!!!";
    }
}
