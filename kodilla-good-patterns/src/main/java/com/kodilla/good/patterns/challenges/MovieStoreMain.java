package com.kodilla.good.patterns.challenges;

import java.util.*;

public class MovieStoreMain {
    public static void main(String args[]) {
        MovieStore theMovieStore = new MovieStore();
        theMovieStore.getMovies().values().stream()
                    .flatMap(Collection::stream)
                    .forEach(e -> System.out.print(e + " ! "));
    }
}
