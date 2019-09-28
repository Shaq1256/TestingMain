package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @After
    public void after(){
        System.out.println("Test case end.");
    }
    @Before
    public void before(){
        System.out.println("Test case begin");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        //When
        OddNumbersExterminator.exterminate(list);
        //Then
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        if (list.size() <= 0){
            System.out.println("The list is empty.");
        } else {
            Assert.assertEquals(list, result);
        }
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        //When
        OddNumbersExterminator.exterminate(list);
        System.out.println(OddNumbersExterminator.exterminate(list));
        //Then
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(list);
        Assert.assertNotEquals(list, result);
    }
}
