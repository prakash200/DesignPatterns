package Creational.Factory;

public class Driver {

    public static void main(String[] args){

        System.out.println("\n Welcome to Pizza factory \n");
        Pizza tomatoPizza = PizzaFactory.getPizza(PizzaType.TOMATO);
        Pizza onionPizza = PizzaFactory.getPizza(PizzaType.ONION);
        Pizza margaritaPizza = PizzaFactory.getPizza(PizzaType.MARGARITA);
        Pizza chickenPizza = PizzaFactory.getPizza(PizzaType.CHICKEN);

        System.out.println(tomatoPizza.getName());
        System.out.println(onionPizza.getName());
        System.out.println(margaritaPizza.getName());
        System.out.println(chickenPizza.getName());

    }
}
