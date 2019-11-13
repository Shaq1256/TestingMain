package com.kodilla.exception.test;

import javax.management.relation.RoleInfoNotFoundException;
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
    Boolean findFlight(Flight flight) throws RoleInfoNotFoundException {
        Map<String, Boolean> directions = initDirections();
        if(!directions.entrySet().contains(flight.getDepartureAirport()) || !directions.entrySet().contains(flight.getArrivalAirport())) {
            throw new RoleInfoNotFoundException();
        } else if (directions.containsValue(false)) {
            throw new RoleInfoNotFoundException();
        }
        return true;
    }

    public static void Main(String[] args) {
        
    }
}
