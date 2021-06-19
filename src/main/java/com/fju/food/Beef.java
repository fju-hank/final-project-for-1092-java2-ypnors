package com.fju.food;

public class Beef extends Menu{
    public Beef(){
        id = "a";
    }

    @Override
    public String getName() {
        return "牛排";
    }

    @Override
    public int price() {
        return 200;
    }
}
