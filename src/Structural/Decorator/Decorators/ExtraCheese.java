package Structural.Decorator.Decorators;

import Structural.Decorator.Burgers.IBurger;

public class ExtraCheese extends BurgerDecorator{

    public ExtraCheese(IBurger burger){
        super(burger);
    }

    @Override
    public String description(){
        return "Extrac Cheese " + burger.description();
    }

    @Override
    public Integer getCost(){
        return 10 + burger.getCost();
    }


}
