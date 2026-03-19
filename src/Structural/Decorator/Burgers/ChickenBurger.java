package Structural.Decorator.Burgers;

public class ChickenBurger implements IBurger{

    @Override
    public String description(){
        return "Chicken Burger";
    }

    @Override
    public Integer getCost(){
        return 150;
    }
}
