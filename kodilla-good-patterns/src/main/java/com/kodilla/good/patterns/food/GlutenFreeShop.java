package com.kodilla.good.patterns.food;

public class GlutenFreeShop implements OrderServiceProcess {
    String companyName;

    public GlutenFreeShop(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    @Override
    public void process() {
        System.out.println(getCompanyName() + " - your order has been processed!!!");
    }
}
