package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userNo;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsCount;

    public ForumUser(final int userNo, final String userName, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.userNo = userNo;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getUserNo() {
        return userNo;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "user id: " + userNo +
                ", user name: '" + userName + '\'' +
                ", sex: " + sex +
                ", date of birth: " + dateOfBirth +
                ", posts count: " + postsCount +
                '}';
    }
}
