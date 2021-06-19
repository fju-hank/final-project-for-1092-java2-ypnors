package com.fju.food;
public class Shrimp extends Menu{
    public Shrimp(){
        id = "i";
    }

    @Override
    public String getName() {
        return "天婦羅";
    }

    @Override
    public int price() {
        return 50;
    }
}
