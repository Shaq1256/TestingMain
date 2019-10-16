package com.kodilla.testing.forum.statistics;

import java.util.List;

public class AdvStatistics {
    private int noOfPosts;
    private int noOfComments;
    private List<String> usersNameList;

    public void calculateAdvStatistics(Statistics statistics){
        noOfPosts = statistics.postsCount();
        noOfComments = statistics.commentsCount();
        usersNameList = statistics.usersName();

    }
    public int getUsersNameList(){
        return usersNameList.size();
    }
    public int postCount() {
        return noOfPosts;
    }
    public int commentsCount() {
        return noOfComments;
    }
    public double getAvgPostsPerUser(){
        return noOfComments/noOfPosts;
    }
    public double getAvgCommentsPerUser(){
        return noOfComments/usersNameList.size();
    }
    public  double getAvgCommentsPerPosts(){
        System.out.println(noOfComments+" " +noOfPosts);
        return noOfComments/noOfPosts;

    }

}
