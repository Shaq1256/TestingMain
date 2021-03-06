package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateTestAdvStatistics {
    @Test
    public void countPostsZero() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        //Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.postCount());
    }

    @Test
    public void countPostsThousand() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        AdvStatistics advStatistics = new AdvStatistics();
        //Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, advStatistics.postCount());
    }

    @Test
    public void countComments0() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        //Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.commentsCount());
    }

    @Test
    public void countCommentsLessThenPosts() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        // Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, advStatistics.getAvgCommentsPerPosts(), 0.01);
    }

    @Test
    public void countCommentsMoreThenPosts() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);
        // Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, advStatistics.getAvgCommentsPerPosts(), 0.01);
    }

    @Test
    public void usersCount0() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> userList = new ArrayList<String>();
//        userList.add("User1");
        when(statisticsMock.usersName()).thenReturn(userList);
        //Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.getUsersNameList());
    }

    @Test
    public void usersCount100() {
        //When
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> userList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            userList.add("User" + i);
        }
        when(statisticsMock.usersName()).thenReturn(userList);
        //Given
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, advStatistics.getUsersNameList());
    }
}
