package Creational.AbstractFactory.Dominos;

import Creational.AbstractFactory.Pizza;

public class TomatoPizza implements Pizza {

    @Override
    public String getName(){
        return "Tomato Pizza from Dominos is Ready!!!";
    }
}
