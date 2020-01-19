package com.kodilla.good.patterns.food;

public class ExtraFoodShop implements OrderServiceProcess {
    String companyName;

    public ExtraFoodShop(String companyName) {
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
