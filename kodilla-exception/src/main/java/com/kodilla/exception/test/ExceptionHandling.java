package com.kodilla.exception.test;

import static java.lang.System.out;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 4);
        } catch (Exception e) {
            out.println("Error!!!");
        } finally {
            out.println("******  Your result is above  ******");
        }
    }
}
