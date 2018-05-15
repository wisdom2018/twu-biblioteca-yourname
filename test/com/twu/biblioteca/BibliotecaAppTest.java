package com.twu.biblioteca;

import com.twu.biblioteca.Entity.Book;
import org.junit.Test;

import java.util.ArrayList;

public class BibliotecaAppTest {

   Book app = new Book();

    @Test
    public void listAllBooks_test() {


        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Book> result = new ArrayList<Book>();
        Book book1 = new Book(001,"software development","wisdom",
                "intrduce software development",true,"2016-12-03");
        Book book2 = new Book(002,"software automation","jack",
                "intrduce software development",true,"2015-11-03");
        Book book3 = new Book(003,"Computer technology","hall",
                "computer technology knowledge ",true,"2014-12-03");
        books.add(book1);
        books.add(book2);
        books.add(book3);

       result = app.bookList();
    }
}