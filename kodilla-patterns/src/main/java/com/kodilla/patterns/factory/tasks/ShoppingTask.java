package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public String executeTask() {
        return "Task has been executed";
    }

    @Override
    public String getTaskName() {
        return "Task name is: " + taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    @Override
    public String toString() {
        return taskName + whatToBuy + quantity;
    }
}
