package com.fju.food;
public class Shrimp extends Menu{
    public Shrimp(){
        id = "m";
    }

    @Override
    public String getName() {
        return "炸蝦天婦羅";
    }

    @Override
    public int price() {
        return 50;
    }
}
