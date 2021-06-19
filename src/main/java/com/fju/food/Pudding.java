package com.fju.food;

public class Pudding extends Menu{
    public Pudding(){
        id = "j";
    }

    @Override
    public String getName() {
        return "布丁";
    }

    @Override
    public int price() {
        return 30;
    }
}
