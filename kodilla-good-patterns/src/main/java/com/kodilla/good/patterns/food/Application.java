package com.kodilla.good.patterns.food;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        HealthyShop healthyShop = new HealthyShop("HealthyShop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop");

        List<OrderServiceProcess> producersList = new ArrayList<OrderServiceProcess>();
        producersList.add(extraFoodShop);
        producersList.add(healthyShop);
        producersList.add(glutenFreeShop);

        for (int i = 0; i < producersList.size(); i++) {
            producersList.get(i).process();
        }
    }
}
