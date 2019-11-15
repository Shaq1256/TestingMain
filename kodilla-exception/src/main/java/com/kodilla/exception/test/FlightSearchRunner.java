package com.kodilla.exception.test;

public class FlightSearchRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("Rome", "Warsaw");
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("No flights for this City!!!");
        } finally {
            System.out.println("You result above.");
        }

    }
}
