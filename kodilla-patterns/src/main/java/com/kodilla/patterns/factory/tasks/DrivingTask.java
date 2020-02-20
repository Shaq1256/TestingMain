package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName;
    String where;
    String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return taskName + where + using;
    }
}
