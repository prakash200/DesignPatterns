package Creational.AbstractFactory.PizzaHut;

import Creational.AbstractFactory.IPizza;

public class ChickenPizza implements IPizza {

    @Override
    public String getName(){
        return "Chicken Pizza from PizzaHut is ready!!!";
    }
}
