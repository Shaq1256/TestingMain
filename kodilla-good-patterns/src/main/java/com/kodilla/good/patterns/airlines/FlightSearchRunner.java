package com.kodilla.good.patterns.airlines;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Gdansk", "Katowice");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
            System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        } catch (RouteNotFoundException e) {
            System.out.println("No flights for this City!!!");
        } finally {
            System.out.println("Your result above.");
        }

        flightSearch.findConnections();

    }
}
