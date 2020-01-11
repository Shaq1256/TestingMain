package com.kodilla.good.patterns.challenges;

public class SaleDto {
   public User user;
   public Boolean isRented;

    public SaleDto(User user, Boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public Boolean getRented() {
        return isRented;
    }
}
