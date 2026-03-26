package Structural.Facade.MenuLists;

import Structural.Facade.MenuLists.Services.JuiceMenu;
import Structural.Facade.MenuLists.Services.NonVegMenu;
import Structural.Facade.MenuLists.Services.VegMenu;

public class Driver {
    public static void main(String[] args){
        System.out.println("\nWelcome to facade\n");

        // Brute force : With out Facacde interface, client code has to call all multiple menus
        // in client code (driver code) which is tightly Coupling..
        // EX : To make burger ready, calling order, preparing , delivery etc..
        // With facade, client need to call just facade interface ..

        MenuManager menuManager = new MenuManager(
                new VegMenu(),
                new NonVegMenu(),
                new JuiceMenu()
        );

        System.out.println(menuManager.getVegMenu());
        System.out.println(menuManager.getNonVegMenu());
        System.out.println(menuManager.getJuiceMenu());
    }
}
