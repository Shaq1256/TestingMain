package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {
    @After
    public void after() {
        System.out.println("Test case end.");
    }

    @Before
    public void before() {
        System.out.println("Test case begin");
    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Ostatni wpis.");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Ostatni wpis.", lastLog);
    }
}
