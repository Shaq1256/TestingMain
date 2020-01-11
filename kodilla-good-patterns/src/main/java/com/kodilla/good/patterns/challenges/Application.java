package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        User user = new User("Tomasz", "Hajto");

        LocalDateTime orderDate = LocalDateTime.of(2019, Month.APRIL, 10, 11, 11, 11);

        SaleRequest saleRequest = new SaleRequest();
        boolean isSold = saleRequest.sale(user, orderDate);

        MailService mailService = new MailService();

        if (isSold) {
            mailService.sendEmail(user.getName()+" "+user.getSurname());
        } else {
            System.out.println("Sale request has been rejected!!!");
        }

    }
}
