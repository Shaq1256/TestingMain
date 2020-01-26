package com.kodilla.good.patterns.airlines;

public class FlightSearchRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.prepareSet();

        Flight flight = new Flight("Gdansk", "Wroclaw");

        // 1
        System.out.println("Flights to ariport: " + flight.arrivalAirport);
        flightSearch.getFlightTo(flight.arrivalAirport);

        // 2
        System.out.println("Flights from ariport: " + flight.departureAirport);
        flightSearch.getFlightFrom(flight.departureAirport);

        // 3
        flightSearch.findConnections(flight);

    }
}
