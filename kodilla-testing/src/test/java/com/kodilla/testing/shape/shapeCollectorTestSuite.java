package com.kodilla.testing.shape;

import org.junit.*;

public class shapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        Circle circle = new Circle("circle1", 4);
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle1", 4);
        shapeCollector.addFigure(circle);
        //When
        Shape retrivedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, retrivedShape);
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle1", 4);
        shapeCollector.addFigure(circle);
        //When
        boolean removeFigure = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertTrue(removeFigure);
        Assert.assertEquals(0, shapeCollector.shapes.size());
    }

}