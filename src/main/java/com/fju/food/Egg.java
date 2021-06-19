package com.fju.food;

public class Egg extends   Menu{
    public Egg(){
        id = "l";
    }

    @Override
    public String getName() {
        return "溏心蛋";
    }

    @Override
    public int price() {
        return 25;
    }
}
