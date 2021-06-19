package com.fju.food;
public class HotSpringEgg extends Menu{
    public HotSpringEgg(){
        id = "k";
    }

    @Override
    public String getName() {
        return "溫泉蛋";
    }

    @Override
    public int price() {
        return 25;
    }
}
