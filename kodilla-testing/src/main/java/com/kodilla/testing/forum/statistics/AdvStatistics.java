package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

public class AdvStatistics {
    private int noOfPosts;

    public void calculateAvdStatistics(Statistics statistics){
        noOfPosts = statistics.postsCount();
    }

    public int postCount() {
        return noOfPosts;
    }
}
