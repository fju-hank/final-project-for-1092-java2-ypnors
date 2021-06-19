package com.fju.food;

public abstract class Menu {
    String id;
    public boolean name(String name){
        return (id.startsWith(name));
    }
    public abstract String getName();
    public abstract int price();

}