package com.fju.food;

public class Sashimi extends Menu{
    public Sashimi(){
        id = "l";
    }

    @Override
    public String getName() {
        return "綜合生魚片";
    }

    @Override
    public int price() {
        return 250;
    }
}