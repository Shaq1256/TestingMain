package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class SaleRequest implements InformationService, SaleRepository, SaleService {
    public boolean sale(final User user, final LocalDateTime dateSale) {
        System.out.println("Product sold to: " + user.getName() + " " + user.getSurname() + "," + " Date of sale: " + dateSale.getYear()+"-"+dateSale.getMonth()+"-"+dateSale.getDayOfMonth());
        return true;
    }
}
