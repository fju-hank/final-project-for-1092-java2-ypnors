package com.fju.food;

public class Pork extends Menu{
    public Pork(){
        id = "e";
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