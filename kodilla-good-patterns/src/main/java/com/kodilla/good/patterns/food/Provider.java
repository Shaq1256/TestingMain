package com.kodilla.good.patterns.food;

public class Provider implements OrderServiceProcess {
    @Override
    public void process(String str) {
        System.out.println(str + " - your order has been procesed!!!");
    }
}
