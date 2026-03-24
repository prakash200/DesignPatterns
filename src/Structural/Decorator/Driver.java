package Structural.Decorator;
import Structural.Decorator.Burgers.ChickenBurger;
import Structural.Decorator.Burgers.Burger;
import Structural.Decorator.Burgers.VegBurger;
import Structural.Decorator.Decorators.ExtraCheese;
import Structural.Decorator.Decorators.ExtraPatty;

public class Driver {

    public static void main(String[] args){
        System.out.println("Decorator Pattern\n");

        Burger vegBurger = new VegBurger();
        Burger chickenBurger  = new ChickenBurger();

        System.out.println(vegBurger.description());
        System.out.println(vegBurger.getCost());
        Burger extraPattyBurger = new ExtraPatty(vegBurger);
        System.out.println(extraPattyBurger.description());
        System.out.println(extraPattyBurger.getCost());

        System.out.println(" ");
        System.out.println(chickenBurger.description());
        System.out.println(chickenBurger.getCost());

        // Wy we have defined type as Burger
        // Dependency inversion principle and also later if we want to change to pizza decorator
        Burger extraCheeseBurger = new ExtraCheese(chickenBurger);
        System.out.println(extraCheeseBurger.description());
        System.out.println(extraCheeseBurger.getCost());

        Burger extraPattyCheeseBurger = new ExtraPatty(extraCheeseBurger);
        System.out.println(extraPattyCheeseBurger.description());
        System.out.println(extraPattyCheeseBurger.getCost());

    }
}
