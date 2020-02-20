package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String shoppingTask = "shoppingTask";
    public static final String paintingTask = "paintingTask";
    public static final String drivingTask = "drivingTask";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case shoppingTask:
                return new ShoppingTask("Shopping", " Shoes ", 2);
            case paintingTask:
                return new PaintingTask("Painting", " white ", "walls");
            case drivingTask:
                return new DrivingTask("Driving", " seaside ", "car");
            default:
                return null;
        }
    }
}
