package com.kodilla.good.patterns.airlines;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Map<String, Boolean> initDirections() {
        Map<String, Boolean> directions = new HashMap<>();
        directions.put("Gdansk", true);
        directions.put("Wroclaw", true);
        directions.put("Warszawa", true);
        directions.put("Katowice", true);

        return directions;
    }

    public Map<String, String> mapConnections() {
        Map<String, String> connections = new HashMap<>();
        connections.put("Gdansk", "Katowice");
        connections.put("Gdansk", "Warszawa");
        connections.put("Gdansk", "Wroclaw");
        connections.put("Warszawa", "Katowice");
        connections.put("Warszawa", "Wroclaw");
        connections.put("Warszawa", "Gdansk");
        connections.put("Katowice", "Wroclaw");
        return connections;
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

    Boolean findConnections(Flight flight) {
        Map<String, String> connections = mapConnections();
        if(connections.containsKey(flight.getDepartureAirport()) || connections.containsValue(flight.getArrivalAirport())){
            Map<String, String> ourConnections = new HashMap<>();
            ourConnections.put(connections.get(flight.getDepartureAirport()), connections.get(flight.getArrivalAirport()));
            System.out.println(ourConnections);
        }
        return true;
    }


}
