package com.fju.food;
public class FrenchFries extends Menu{
    public FrenchFries(){
        id = "g";
    }

    @Override
    public String getName() {
        return "薯條";
    }

    @Override
    public int price() {
        return 35;
    }
}
