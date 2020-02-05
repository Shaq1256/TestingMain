package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest {

    public SaleRequest(final User user, final String object, final LocalDateTime dateSale) {
        System.out.println("Product " + object + " sold to: " + user.getName() + " " + user.getSurname() + "," + " Date of sale: " + dateSale.getYear() + "-" + dateSale.getMonth() + "-" + dateSale.getDayOfMonth());

    }
}
