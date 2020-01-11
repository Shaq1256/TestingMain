package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;
    private SaleRequest saleRequest;

    public ProductOrderService(final InformationService informationService, final SaleService saleService, final SaleRepository saleRepository, final SaleRequest saleRequest) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
        this.saleRequest = saleRequest;
    }

//    public SaleDto process(final SaleRequest rentRequest) {
//        boolean isSold = saleService.rent(user);
//        if (isSold) {
//            informationService.inform(saleRequest.getUser());
//            saleRepository.createSale(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
//            return new SaleDto(rentRequest.getUser(), true);
//        } else {
//            return new SaleDto(rentRequest.getUser(), false);
//        }
//    }
}
