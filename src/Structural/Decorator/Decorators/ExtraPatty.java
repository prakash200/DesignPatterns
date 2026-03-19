package Structural.Decorator.Decorators;

import Structural.Decorator.Burgers.IBurger;

public class ExtraPatty extends BurgerDecorator {

    public ExtraPatty(IBurger burger){
        super(burger);
    }

    @Override
    public String description(){
        return "Extra patty " + burger.description();
    }

    public Integer getCost(){
        return 25 + burger.getCost();
    }


}
