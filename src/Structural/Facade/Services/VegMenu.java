package Structural.Facade.Services;
import Structural.Facade.Services.IMenu;

import java.awt.*;

public class VegMenu implements IMenu {

    @Override
    public String getMenu(){
        return "Serving Veg Menu";
    }
}
