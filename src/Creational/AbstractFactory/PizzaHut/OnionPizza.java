package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.IPizza;

public class OnionPizza implements IPizza {

    @Override
    public String getName(){
        return "Onion Pizza from PizaHut is Ready!!!";
    }
}
