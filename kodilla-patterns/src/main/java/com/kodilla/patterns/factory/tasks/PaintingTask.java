package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName;
    String color;
    String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        return true;
    }

    @Override
    public String toString() {
        return taskName + color + whatToPaint;
    }
}
