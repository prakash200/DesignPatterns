package Structural.Decorator.Decorators;

import Structural.Decorator.Burgers.Burger;

// This abstract class is created because for removing repeatative behaviour of defining
// burger variable and initializing burger class in all decorator classes..
public abstract class BurgerDecorator implements Burger {

    protected Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger ;
    }
}
