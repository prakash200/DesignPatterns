package Structural.Decorator.Decorators;

import Structural.Decorator.Burgers.IBurger;

// This abstract class is created because for removing repeatative behaviour of defining
// burger variable and initializing burger class in all decorator classes..
public abstract class BurgerDecorator implements IBurger {

    protected IBurger burger;

    public BurgerDecorator(IBurger burger){
        this.burger = burger ;
    }
}
