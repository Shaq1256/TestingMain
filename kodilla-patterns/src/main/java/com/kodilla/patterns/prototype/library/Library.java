package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " \n" + books;
    }

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for (Book booksList : books) {
            Book cloneBooksList = new Book(booksList.getTitle(), booksList.getAuthor(), booksList.getPublicationDate().getYear(), booksList.getPublicationDate().getMonthValue(), booksList.getPublicationDate().getDayOfMonth());
            cloneLibrary.getBooks().add(cloneBooksList);
        }
        return cloneLibrary;
    }
}