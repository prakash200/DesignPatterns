package Creational.Factory;

public class Driver {

    public static void main(String[] args){

        System.out.println("\n Welcome to Pizza factory \n");

        PizzaFactory factory = new PizzaFactory();

        Pizza tomatoPizza = factory.getPizza(PizzaType.TOMATO);
        Pizza onionPizza = factory.getPizza(PizzaType.ONION);
        Pizza margaritaPizza = factory.getPizza(PizzaType.MARGARITA);
        Pizza chickenPizza = factory.getPizza(PizzaType.CHICKEN);

        System.out.println(tomatoPizza.getName());
        System.out.println(onionPizza.getName());
        System.out.println(margaritaPizza.getName());
        System.out.println(chickenPizza.getName());

    }
}
