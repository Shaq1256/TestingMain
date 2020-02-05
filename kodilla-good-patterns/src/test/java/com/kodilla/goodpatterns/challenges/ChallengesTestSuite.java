package com.kodilla.goodpatterns.challenges;

import com.kodilla.good.patterns.challenges.MovieStore;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChallengesTestSuite {
    @After
    public void after() {
        System.out.println("Test case end.");
    }

    @Before
    public void before() {
        System.out.println("Test case begin");
    }

    @Test
    public void movieStoreList() {
        //Given
        MovieStore theMovieStore = new MovieStore();
        theMovieStore.getMovies().values().stream()
                .flatMap(Collection::stream)
                .forEach(e -> System.out.print(e + " ! "));
        System.out.println("");
        //When

        //Then
//        Assert.assertArrayEquals("Zelazny Czlowiek ! Iron Man ! Msciciele ! Avengers ! Blyskawica ! Flash !", result);
    }
}
