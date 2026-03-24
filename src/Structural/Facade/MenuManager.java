package Structural.Facade;

import Structural.Facade.Services.Menu;

public class MenuManager {

    private final Menu vegMenu;
    private final Menu nonVegMenu;
    private final Menu juiceMenu;

    public MenuManager(Menu vegMenu, Menu nonVegMenu, Menu juiceMenu){
        this.vegMenu = vegMenu;
        this.nonVegMenu = nonVegMenu;
        this.juiceMenu = juiceMenu;
    }

    public String getVegMenu(){
        return vegMenu.getMenu();
    }

    public String getNonVegMenu(){
        return nonVegMenu.getMenu();
    }

    public String getJuiceMenu(){
        return juiceMenu.getMenu();
    }
}
