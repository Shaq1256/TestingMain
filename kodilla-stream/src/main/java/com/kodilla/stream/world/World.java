package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class World {
    List<Continent> continentList = new ArrayList<>();

        public void setContinentList(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }
}
