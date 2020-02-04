package com.kodilla.spring.portfolio;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String showTasks() {
        return "toDoLIst size: " + toDoList.getTasks().size() + " inProgresList size: " + inProgressList.getTasks().size() + " doneList size " + doneList.getTasks().size();
    }
}
