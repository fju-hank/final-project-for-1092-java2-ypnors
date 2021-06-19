package com.fju.food;

public class Egg extends Menu{
    public Egg(){
        id = "e";
    }

    @Override
    public String getName() {
        return "溏心蛋";
    }

    @Override
    public int price() {
        return 30;
    }
}
