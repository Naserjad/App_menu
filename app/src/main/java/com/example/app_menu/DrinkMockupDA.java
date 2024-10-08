package com.example.app_menu;

import java.util.ArrayList;
import java.util.List;

public class DrinkMockupDA {

    private List<Drink> drinks;

    public DrinkMockupDA(){
        drinks=new ArrayList<>();
        drinks.add(new Drink("Americano",15,"hot Drink"));
        drinks.add(new Drink("Latte",15,"hot Drink"));
        drinks.add(new Drink("Tea",10,"hot Drink"));
        drinks.add(new Drink("Sprite",7,"Cold Drink"));
        drinks.add(new Drink("Ice Coffe",10,"Cold Drink"));
    }

    public String[] getDrinkTypes(){
        String[] types={"Hot Drinks","Cold Drinks"};
        return types;
    }
    public List<Drink>getDrinkByType(String drinkType){
        List<Drink> result=new ArrayList<>();
        for(Drink d:drinks){
            if(d.getType().equals(drinkType)){
                result.add(d);
            }
        }
        return result;
    }

}
