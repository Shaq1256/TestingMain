package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateTestAdvStatistics {
    @Test
    public void countPostsZero(){
        //When
        Statistics statistics = new MockStatistics();
        AdvStatistics avdStatistics = new AdvStatistics();
        //Given
        avdStatistics.calculateAvdStatistics(statistics);
        //Then
        Assert.assertEquals(0, avdStatistics.postCount());
    }
    @Test
    public void countPostsThousand(){
        //When
        Statistics statistics = new MockStatistics();
        AdvStatistics avdStatistics = new AdvStatistics();
        //Given
        for(int i=0; i<1000; i++){
            ((MockStatistics)statistics).addPost("a");
        }
        avdStatistics.calculateAvdStatistics(statistics);
        //Then
        Assert.assertEquals(1000, avdStatistics.postCount());
    }

    private class MockStatistics implements Statistics{
        List<String> postCountList = new ArrayList<>();

        public void addPost(String post){
            postCountList.add(post);
        }
        @Override
        public List<String> usersName() {
            return null;
        }

        @Override
        public int postsCount() {
            return postCountList.size();
        }

        @Override
        public int commentsCount() {
            return 0;
        }
    }
}
