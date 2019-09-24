package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("TheForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("TheForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test kalkulatora:");
        Calculator calc = new Calculator();

        Integer result2 = calc.Add(4, 2);
        if(result2.equals(6)) {
            System.out.println("Add method test - OK");
        } else {
            System.out.println("Add method test - Error!!!");
        }

        Integer result3 = calc.Subtract(5, 3);
        if(result3.equals(2)) {
            System.out.println("Subtract method test - OK");
        } else {
            System.out.println("Subtract method test - Error!!!");
        }
    }
}
