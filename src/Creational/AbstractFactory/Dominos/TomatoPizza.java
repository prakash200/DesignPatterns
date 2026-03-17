package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.IPizza;

public class TomatoPizza implements IPizza {

    @Override
    public String getName(){
        return "Tomato Pizza from Dominos is Ready!!!";
    }
}
