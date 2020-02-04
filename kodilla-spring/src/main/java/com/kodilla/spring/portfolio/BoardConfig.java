package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class BoardConfig {
    ArrayList taskList;

    @Bean
    public Board board() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList(taskList);
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList(taskList);
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList(taskList);
    }
}
