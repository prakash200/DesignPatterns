package Creational.AbstractFactory;

import Creational.AbstractFactory.PizzaFactory.PizzaFactory;
import Creational.AbstractFactory.enums.PizzaType;
import Creational.AbstractFactory.enums.StoreType;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Welcome to Abstract Pizza Factory\n");

        System.out.println("\n Dominos Pizza Store \n");
        PizzaFactory factory = AbstractPizzaFactory.getPizzaFactory(StoreType.DOMINOS);

        System.out.println(factory.getPizza(PizzaType.ONION).getName());
        System.out.println(factory.getPizza(PizzaType.TOMATO).getName());
        System.out.println(factory.getPizza(PizzaType.CHICKEN).getName());

        System.out.println("\n PizzaHut Pizza Store \n");

        PizzaFactory factory1 = AbstractPizzaFactory.getPizzaFactory(StoreType.PIZZAHUT);

        System.out.println(factory1.getPizza(PizzaType.ONION).getName());
        System.out.println(factory1.getPizza(PizzaType.TOMATO).getName());
        System.out.println(factory1.getPizza(PizzaType.CHICKEN).getName());


    }
}
