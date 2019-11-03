package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {2, 4, 6, 3, 9, 7, 1, 4};
        //When
        ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(4.5, numbers);
    }
}
