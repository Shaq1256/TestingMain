package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        List<Continent> continents = new ArrayList<>();
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", new BigDecimal(35000)));
        countries.add(new Country("Spain", new BigDecimal(45000)));
        continents.add(new Continent(countries, "Europe"));
        continents.add(new Continent(countries, "America"));
        world.setContinentList(continents);
        //When
        BigDecimal worldPeopleQuantity = world.getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream()
                        .map(country -> country.getPeopleQuantity())
                        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        BigDecimal expectedQuantity = new BigDecimal("80000");
        Assert.assertEquals(expectedQuantity, worldPeopleQuantity);
    }
}
