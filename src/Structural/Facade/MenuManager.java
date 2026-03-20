package Structural.Facade;

import Structural.Facade.Services.IMenu;

public class MenuManager {

    private final IMenu vegMenu;
    private final IMenu nonVegMenu;
    private final IMenu juiceMenu;

    public MenuManager(IMenu vegMenu, IMenu nonVegMenu, IMenu juiceMenu){
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
