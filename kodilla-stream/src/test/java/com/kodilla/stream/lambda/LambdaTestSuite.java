package com.kodilla.stream.lambda;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LambdaTestSuite {
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }

    @Test
    public void testPoemBeautifier() {
        //Given
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Jezeli myslisz, ze nie mozesz nic zmienic, zmien myslenie.", (String)->String.substring(43, 57));
        //When
        PoemDecorator poem = poemBeautifier.beautify();
        //Then
        Assert.assertEquals("zmien myslenie", poem);
    }
}
