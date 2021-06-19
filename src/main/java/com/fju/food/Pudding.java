package com.fju.food;

public class Pudding extends Menu{
    public Pudding(){
        id = "t";
    }

    @Override
    public String getName() {
        return "抹茶布丁";
    }

    @Override
    public int price() {
        return 30;
    }
}
