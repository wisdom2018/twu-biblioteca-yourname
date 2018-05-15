package com.twu.biblioteca.Entity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class LibrayTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    Libray libray = new Libray();
    ArrayList<Book> bookList = new ArrayList<>();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(out));
        Book book1 = new Book(1,"software development","wisdom",
                "intrduce software development",true,"2016-12-03");
        Book book2 = new Book(2,"software automation","jack",
                "intrduce software development",true,"2015-11-03");
        Book book3 = new Book(3,"Computer technology","hall",
                "computer technology knowledge ",true,"2014-12-03");
        libray.addBook(book1);
        libray.addBook(book2);
        libray.addBook(book3);
    }

    @After
    public void tearDown()throws Exception{
        System.setOut(null);
    }

    @Test
    public void selectMenu() {
        libray.showMainMenu();
        assertThat( out.toString(), containsString( "Menu" ));
    }

    @Test
    public void borrowBook_test() {
        int bookID = 1;
        libray.borrowBook(bookID);
        assertThat(out.toString(),containsString("Enjoy"));
    }


    @Test
    public void displayBookInformation() {
        int bookID = 2;
        libray.displayBookInformation(bookID);
        assertThat(out.toString(),containsString("jack"));
    }

    @Test
    public void returnBook() {
        int bookID = 1;
        libray.returnBook(bookID);
        assertThat(out.toString(),containsString("return"));
    }
}