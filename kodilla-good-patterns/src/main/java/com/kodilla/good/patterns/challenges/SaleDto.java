package com.kodilla.good.patterns.challenges;

public class SaleDto {
   public User user;
   public Boolean isSold;

    public SaleDto(User user, Boolean isSold) {
        this.user = user;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Boolean getIsSold() {
        return isSold;
    }
}
