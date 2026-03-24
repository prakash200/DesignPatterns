package Structural.Decorator.Burgers;

public class VegBurger implements Burger {
    @Override
    public String description() {
        return "Veg Burger";
    }

    @Override
    public Integer getCost() {
        return 100;
    }
}
