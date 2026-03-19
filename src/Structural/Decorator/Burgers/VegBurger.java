package Structural.Decorator.Burgers;

public class VegBurger implements IBurger{
    @Override
    public String description() {
        return "Veg Burger";
    }

    @Override
    public Integer getCost() {
        return 100;
    }
}
