package com.fju.food;

public class CheesePork extends Menu{
    public CheesePork(){
        id = "b";
    }

    @Override
    public String getName() {
        return "起司豬排";
    }

    @Override
    public int price() {
        return 200;
    }
}
