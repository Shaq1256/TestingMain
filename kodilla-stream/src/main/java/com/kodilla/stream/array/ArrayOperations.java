package com.kodilla.stream.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .forEach(d -> System.out.println(numbers[d] + " "));
        double num = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        return num;
    }
}
