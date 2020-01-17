package com.kodilla.good.patterns.food;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList producersList = new ArrayList();
        producersList.add("HealthyShop");
        producersList.add("ExtraFoodShop");
        producersList.add("GlutenFreeShop");

        Provider provider = new Provider();

        for (Object o : producersList) {
            provider.process(o.toString());
        }
    }
}
