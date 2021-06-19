package com.fju;


import com.fju.food.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Menu[] food = {
                new Beef(),  new CheesePork(), new Coke(), new Chicken(),new Egg(),
                new Fish(), new FrenchFries(),  new HotSpringEgg(),
                new Pork(),new Pudding(), new Salmon(),new Sashimi(),  new Shrimp()

        };
        Scanner scan = new Scanner(System.in);
        String input = null;
        int end = -1;
        int sum = 0;
        ReadFile readFile = new ReadFile();
        readFile.print();
        System.out.println();
        System.out.println("今天想吃什麼?請輸入代號" +
                        "牛排:a"+
                        "起司豬排:b"+
                        "照燒雞腿:c"+
                        "可樂:d"+
                        "溏心蛋:e"+
                        "鹽烤鯖魚:f"+
                        "薯條:g"+
                        "溫泉蛋:h"+
                        "礁鹽豬排:i"+
                        "布丁:j"+
                        "鮭魚丼飯:k"+
                        "綜合生魚片:l"+
                        "炸蝦天婦羅:m"+
                " 如果想結束點餐請輸入end");
        do{
            input = scan.next();
            for (Menu order : food) {
                if (order.name(input)) {
                    System.out.println(order.getName() + "\t" + order.price());
                    sum = sum + order.price();

                }
                else if(input.equals("end")){
                    System.out.println("總額:" + sum);
                    end = 0;
                }

            }

        }while (end != 0);
    }
}
