package com.kodilla.testing.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> numbers;
    public OddNumbersExterminator(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

}
