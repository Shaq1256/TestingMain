package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Becoming Steve Jobs", "Steve Jobs", 2010,10,12));
        library.getBooks().add(new Book("The Road Ahead", "Bill Gates", 2011, 2, 5));
        library.getBooks().add(new Book("Mapa i Terytorium", "Alan Greenspan", 2018, 7, 22));
        library.getBooks().add(new Book("Thinking in Java", "Bruce Eckel", 2015, 11, 3));
        library.getBooks().add(new Book("Python", "Paul Barry", 2020, 1, 3));
        library.getBooks().add(new Book("Ekonomia Wolnego Rynku", "Rothbard Newton", 2014, 4, 4 ));

        //shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library no 2 - shallow clone");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library no 3 - deep clone");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepCloneLibrary);
        //When

        //Then
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepCloneLibrary.getBooks(), library.getBooks());
    }
}
