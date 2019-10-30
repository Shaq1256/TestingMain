package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    String continentName;
    List<Country> countryList = new ArrayList<>();

    public Continent(List<Country> countryList, String continentName) {
        this.countryList = countryList;
        this.continentName = continentName;
    }
}
