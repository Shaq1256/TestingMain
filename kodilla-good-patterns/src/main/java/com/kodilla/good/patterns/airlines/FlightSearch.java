package com.kodilla.good.patterns.airlines;

import java.util.*;

public class FlightSearch {

    public Map<String, Boolean> initDirections() {
        Map<String, Boolean> directions = new HashMap<>();
        directions.put("Gdansk", true);
        directions.put("Wroclaw", true);
        directions.put("Warszawa", true);
        directions.put("Katowice", true);

        return directions;
    }

//    public Map<String, String> mapConnections() {
//        Map<String, String> connections = new HashMap<>();
//        connections.put("Gdansk", "Katowice");
//        connections.put("Gdansk", "Warszawa");
//        connections.put("Gdansk", "Wroclaw");
//        connections.put("Warszawa", "Katowice");
//        connections.put("Warszawa", "Wroclaw");
//        connections.put("Warszawa", "Gdansk");
//        connections.put("Katowice", "Wroclaw");
//        return connections;
//    }

    List<Flight> mapConnection = Arrays.asList(
            new Flight("Gdansk", "Katowice"),
            new Flight("Gdansk", "Warszawa"),
            new Flight("Gdansk", "Wroclaw"),
            new Flight("Warszawa", "Katowice"),
            new Flight("Warszawa", "Wroclaw"),
            new Flight("Warszawa", "Gdansk"),
            new Flight("Katowice", "Wroclaw")
    );

    public void findConnections() {
        mapConnection.stream()
                .filter(flight -> flight.getDepartureAirport().equals("Gdansk"))
//                .filter(flight -> flight.getArrivalAirport().equals("Katowice"))
                .map(flight -> flight.getDepartureAirport() + " " + flight.getArrivalAirport())
                .forEach(System.out::println);
    }


    Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> directions = initDirections();
        if(!directions.containsKey(flight.getDepartureAirport()) || !directions.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else if (!directions.get(flight.getDepartureAirport())) {
            throw new RouteNotFoundException();
        }
        return true;
    }

}
