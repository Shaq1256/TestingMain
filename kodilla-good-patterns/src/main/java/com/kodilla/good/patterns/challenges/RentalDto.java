package com.kodilla.good.patterns.challenges;

public class RentalDto {
    public boolean rentRequest;

    public RentalDto(boolean rentRequest) {
        this.rentRequest = rentRequest;
    }

    public boolean isRentRequest() {
        return rentRequest;
    }
}
