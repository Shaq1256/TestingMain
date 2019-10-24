package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Tomasz Kozakiewicz", 'M', 1999,10,30, 5));
        userList.add(new ForumUser(2, "Mariusz Szczepanski", 'M', 1997,1,22, 3));
        userList.add(new ForumUser(3, "Adam Tomala", 'M', 2001,3,3, 11));
        userList.add(new ForumUser(4, "Marcik Aniola", 'M', 1990,9,11, 0));
        userList.add(new ForumUser(5, "Anna Lesiak", 'F', 2000,11,28, 22));
        userList.add(new ForumUser(6, "Ewa Tomanczyk", 'F', 1995,6,12, 36));
        userList.add(new ForumUser(7, "Adam Satlawa", 'M', 1993,6,29, 11));
        userList.add(new ForumUser(8, "Krzysztof Antkowiak", 'M', 1988,7,2, 8));
        userList.add(new ForumUser(9, "Aneta Sawczuk", 'F', 1995,2,19, 9));
        userList.add(new ForumUser(10, "Ola Jedrzejewska", 'F', 1991,12,12, 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
