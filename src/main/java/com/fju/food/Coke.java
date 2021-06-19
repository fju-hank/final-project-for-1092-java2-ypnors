package com.fju.food;

public class Coke extends Menu{
    public Coke(){
        id = "q";
    }

    @Override
    public String getName() {
        return "可樂";
    }

    @Override
    public int price() {
        return 25;
    }
}
