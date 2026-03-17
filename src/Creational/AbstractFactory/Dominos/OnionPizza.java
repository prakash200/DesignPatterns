package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.IPizza;

public class OnionPizza implements IPizza {

    @Override
    public String getName(){
        return "Onion Pizza from Dominos is ready!!!";
    }
}
