package com.kodilla.stream.book;

import com.kodilla.stream.forumuser.ForumUser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;

public class ForumTestUserSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beginning of tests.");
    }
    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Text no: " + testCounter);
    }
    @Test
    public void testSexM() {
        //Given
        ForumUser forumUser = new ForumUser(7, "Adam Satlawa", 'M', 1993,6,29, 11);
        //When
        char result = forumUser.getSex();
        System.out.println("Testing sex: " + result);
        //Then
        Assert.assertEquals('M', result);
    }
    @Test
    public void testPostsCount() {
        //Given
        ForumUser forumUser = new ForumUser(7, "Adam Satlawa", 'M', 1993,6,29, 11);
        //When
        int result = forumUser.getPostsCount();
        System.out.println("Testing posts count: " + result);
        //Then
        Assert.assertEquals(11, result);
    }

    @Test
    public void testAge() {
        //Given
        ForumUser forumUser = new ForumUser(7, "Adam Satlawa", 'M', 1993,6,29, 11);
        //When
        LocalDate result = forumUser.getDateOfBirth();
        System.out.println("Testing age > 20: " + result);
        //Then
        Assert.assertEquals(26, result);
    }
}
