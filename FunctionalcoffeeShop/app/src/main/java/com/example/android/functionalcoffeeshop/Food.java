package com.example.android.functionalcoffeeshop;

/**
 * Created by EMASYS ND on 6/16/2017.
 */

public class Food {

    private String name;
    private String description;
    //drinks is an array of Drinks
    public static final Food[] foods = {
            new Food("Fried Rice", "A couple of espresso shots with steamed milk"),
            new Food("Cappuccino", "Espresso, hot milk, and a steamed milk foam"),
            new Food("Filter", "Highest quality beans roasted and brewed fresh")
    };
    //Each Drink has a name, description, and an image resource
    private Food(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return this.name;
    }
}
