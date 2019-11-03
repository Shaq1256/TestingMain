package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getAverage(int[] numbers) {
        numbers = IntStream.range(0, numbers.length)
                .forEach(d -> System.out.println(d + " "));
        numbers = IntStream.range(0, numbers.length)
                .average()
                .getAsDouble();
    }
}