package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        User user = new User("Tomasz", "Hajto");
        SaleRequest saleRequest = new SaleRequest(user, "Piłka", LocalDateTime.now());

        SaleServiceImpl saleService = new SaleServiceImpl();
        SaleRepositoryImpl saleRepository = new SaleRepositoryImpl();
        InformationServiceImpl informationService = new InformationServiceImpl();

        ProductOrderService productOrderService = new ProductOrderService(informationService, saleService, saleRepository);

        SaleDto saleDto = productOrderService.process(saleRequest);
        System.out.println("Płatność skończyła się ze statusem: " + saleDto.isSold);
    }
}
