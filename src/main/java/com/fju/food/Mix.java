package com.fju.food;

public class Mix extends Menu{
    public Mix(){
        id = "c";
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