package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User tomasz = new Millenials("Tomasz Machnik");
        User marcin = new YGeneration("Marcin Pniewski");
        User lukasz = new ZGeneration("Lukasz Jerdzejewski");

        //When
        String tomaszUse = tomasz.publisher();
        System.out.println(tomasz.userName + " use - " + tomaszUse);
        String marcinUse = marcin.publisher();
        System.out.println(marcin.userName + " use - " + marcinUse);
        String lukaszUse = lukasz.publisher();
        System.out.println(lukasz.userName + " use - " + lukaszUse);

        //Then
        Assert.assertEquals("Facebook", tomaszUse);
        Assert.assertEquals("Twitter", marcinUse);
        Assert.assertEquals("Snapchat", lukaszUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mietek = new Millenials("Mietek Szczesniak");

        //When
        String mietekUse = mietek.publisher();
        System.out.println(mietek.userName + " use - " + mietekUse);
        mietek.sharePost(new TwitterPublisher());
        mietekUse = mietek.publisher();
        System.out.println(mietek.userName + " now switch to - " + mietekUse);

        //Then
        Assert.assertEquals("Twitter", mietekUse);
    }
}
