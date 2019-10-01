package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
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
        System.out.println("Preparing to execute test: " + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle1", 4);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresCollection().size());
        Assert.assertEquals(circle, shapeCollector.getFiguresCollection().get(0));
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle1", 4);
        Triangle triangle = new Triangle("Triangle1", 5);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        //When
        Shape retrivedShape = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(triangle, retrivedShape);
    }


    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("circle1", 4);
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0, shapeCollector.getFiguresCollection().size());
    }

}