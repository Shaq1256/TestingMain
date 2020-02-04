package com.kodilla.spring.portfolio;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuit {
    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        String name = board.showTasks();
        //Then
        Assert.assertEquals("toDoLIst size: 0 inProgresList size: 0 doneList size 0", name);

    }
}
