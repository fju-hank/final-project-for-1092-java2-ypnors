package com.fju.food;

public class Chicken extends Menu{
    public Chicken(){
        id = "c";
    }

    @Override
    public String getName() {
        return "照燒雞腿";
    }

    @Override
    public int price() {
        return 180;
    }
}
