package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationServiceImpl informationService;
    private SaleServiceImpl saleService;
    private SaleRepositoryImpl saleRepository;
    User user;

    public ProductOrderService(final InformationServiceImpl informationService, final SaleServiceImpl saleService, final SaleRepositoryImpl saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    public SaleDto process(final SaleRequest saleRequest) {
        boolean isSold = saleService.sell(saleRequest);
        if (isSold) {
            informationService.informationService(saleRequest);
            saleRepository.saleRepo(saleRequest);
            return new SaleDto(user, true);
        } else {
            return new SaleDto(user, false);
        }
    }
}
