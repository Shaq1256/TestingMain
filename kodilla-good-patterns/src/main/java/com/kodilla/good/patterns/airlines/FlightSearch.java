package com.kodilla.good.patterns.airlines;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearch {

    HashSet<Flight> connectionsSet = new HashSet<>();

    void prepareSet() {
        connectionsSet.add(new Flight("Gdansk", "Katowice"));
        connectionsSet.add(new Flight("Gdansk", "Warszawa"));
        connectionsSet.add(new Flight("Gdansk", "Wroclaw"));
        connectionsSet.add(new Flight("Warszawa", "Katowice"));
        connectionsSet.add(new Flight("Warszawa", "Wroclaw"));
        connectionsSet.add(new Flight("Warszawa", "Gdansk"));
        connectionsSet.add(new Flight("Katowice", "Wroclaw"));
    }

    public void findConnections(Flight flight) {
        List<Flight> flightsTo = connectionsSet.stream()
                .filter(f -> f.getArrivalAirport().equals(flight.getArrivalAirport()))
                .collect(Collectors.toList());

        List<Flight> indirectFlights = new ArrayList<>();
        for(Flight f : flightsTo) {
            boolean isIndirectAvailable = findFlight(new Flight(flight.getDepartureAirport(), f.departureAirport));
            if (isIndirectAvailable) {
                indirectFlights.add(f);
            }
        }
        System.out.println("Indirect flights between: " + flight.departureAirport + " and " + flight.arrivalAirport);
        indirectFlights.stream().forEach(f -> System.out.println("1 change in: " + f.getDepartureAirport()));
    }


    public void getFlightTo(String flight) {
        connectionsSet.stream()
                .filter(f -> f.getArrivalAirport().equals(flight))
                .map(f -> f.getDepartureAirport() + " " + f.getArrivalAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println(" ");
    }

    public void getFlightFrom(String flight) {
        connectionsSet.stream()
                .filter(f -> f.getDepartureAirport().equals(flight))
                .map(f -> f.getDepartureAirport() + " " + f.getArrivalAirport())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println(" ");
    }


    Boolean findFlight(Flight verifiedFlight) {
        return connectionsSet.contains(verifiedFlight);
    }

}
