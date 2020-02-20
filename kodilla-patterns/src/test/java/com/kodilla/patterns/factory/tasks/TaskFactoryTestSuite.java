package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void TaskFactoryTestSuite() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.shoppingTask);
        Task painting = factory.doTask(TaskFactory.paintingTask);
        Task driving = factory.doTask(TaskFactory.drivingTask);
        //Then
        Assert.assertEquals("Task name is: Shopping", shopping.getTaskName());
        Assert.assertEquals("Task name is: Painting", painting.getTaskName());
        Assert.assertEquals("Task name is: Driving", driving.getTaskName());
        Assert.assertEquals("Task has been executed", shopping.executeTask());
        Assert.assertEquals("Task has been executed", painting.executeTask());
        Assert.assertEquals("Task has been executed", driving.executeTask());
        Assert.assertEquals(false, shopping.isTaskExecuted());
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals(false, driving.isTaskExecuted());

    }
}
