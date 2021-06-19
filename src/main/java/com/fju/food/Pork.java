package com.fju.food;

public class Pork extends Menu{
    public Pork(){
        id = "i";
    }

    @Override
    public String getName() {
        return "礁鹽豬排";
    }

    @Override
    public int price() {
        return 220;
    }
}