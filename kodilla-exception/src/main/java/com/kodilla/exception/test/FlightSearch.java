package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public Map<String, Boolean> initDirections() {
        Map<String, Boolean> directions = new HashMap<>();
        directions.put("Warsaw", true);
        directions.put("London", true);
        directions.put("New York", false);
        directions.put("Rome", true);

        return directions;
    }
    Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> directions = initDirections();
        if(!directions.entrySet().contains(flight.getDepartureAirport()) || !directions.entrySet().contains(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else if (directions.containsValue(false)) {
            throw new RouteNotFoundException();
        }
        return true;
    }


}
