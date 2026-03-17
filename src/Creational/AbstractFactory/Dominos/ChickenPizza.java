package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.IPizza;

public class ChickenPizza implements IPizza {

    @Override
    public String getName(){
        return ("Chicken Pizza from Dominos is ready!!!");
    }
}
