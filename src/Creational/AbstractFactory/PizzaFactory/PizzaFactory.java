package Creational.AbstractFactory.PizzaFactory;

import Creational.AbstractFactory.Pizza.Pizza;
import Creational.AbstractFactory.enums.PizzaType;

public interface PizzaFactory {

    Pizza getPizza(PizzaType pizzaType);}
