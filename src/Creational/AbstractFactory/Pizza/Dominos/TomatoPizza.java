package Creational.AbstractFactory.Pizza.Dominos;

import Creational.AbstractFactory.Pizza.Pizza;

public class TomatoPizza implements Pizza {

    @Override
    public String getName(){
        return "Tomato Pizza from Dominos is Ready!!!";
    }
}
