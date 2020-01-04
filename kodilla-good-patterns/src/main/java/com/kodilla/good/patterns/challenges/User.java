package com.kodilla.good.patterns.challenges;

public class User {
    String name;
    String Surname;

    public User(String name, String surname) {
        this.name = name;
        Surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return Surname != null ? Surname.equals(user.Surname) : user.Surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (Surname != null ? Surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
