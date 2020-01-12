package com.kodilla.good.patterns.challenges;

import java.util.Random;

public class SaleServiceImpl implements SaleService {
    @Override
    public boolean sell(SaleRequest saleRequest) {
        Random random = new Random();
        return random.nextBoolean();
    }

}
