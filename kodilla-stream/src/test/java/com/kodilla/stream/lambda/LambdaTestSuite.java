package com.kodilla.stream.lambda;

import com.kodilla.stream.beautifier.PoemBeautifier;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LambdaTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }

    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Text no: " + testCounter);
    }

    @Test
    public void testPoemBeautifierABC() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String poem = poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String) -> "ABC " + String + " ABC");
        //Then
        Assert.assertEquals("ABC Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie. ABC", poem);
    }

    @Test
    public void testPoemBeautifierUpperCase() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String poem = poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String) -> String.toUpperCase());
        //Then
        Assert.assertEquals("JEZELI MYSLISZ, ZE NIE MOZESZ NIC ZMIENIC, ZMIEN MYSLENIE.", poem);
    }

    @Test
    public void testPoemBeautifierReplace() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String poem = poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String) -> String.replace("e", "E"));
        //Then
        Assert.assertEquals("JEzEli myslisz, zE niE mozEsz nic zmiEnic, zmiEn myslEniE.", poem);
    }

    @Test
    public void testPoemBeautifierSubstring() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        //When
        String poem = poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String) -> String.substring(43, 57));
        //Then
        Assert.assertEquals("zmien myslenie", poem);
    }
}
