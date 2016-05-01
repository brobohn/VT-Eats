package com.cs3714.vt_eats;

/**
 * Created by Ben on 4/29/2016.
 */
public class FoodItem {

    int calories;
    String allergens;

    public FoodItem(int calories, String allergens){
        this.calories = calories;
        this.allergens = allergens;
    }

    public int getCalories(){
        return calories;
    }

    public String getAllergens(){
        return allergens;
    }

}
