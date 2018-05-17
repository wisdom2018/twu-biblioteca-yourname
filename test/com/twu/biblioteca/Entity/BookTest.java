package com.twu.biblioteca.Entity;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookTest {
   Book temp = new Book();
   Book  book =   new Book(4, "Computer technology", "hall",
                              "computer technology knowledge ", true, "2014-12-03");
    @Test
    public void getBookStatus_test() {
      book =   new Book(4, "Computer technology", "hall",
                "computer technology knowledge ", true, "2014-12-03");
      boolean bookStatus = true;
      assertEquals(bookStatus,book.getBookStatus());
    }


    @Test
    public void bookList_test() {
        ArrayList<Book> result = new ArrayList<>();
        Book book1 = new Book(1,"software development","wisdom",
                "intrduce software development",true,"2016-12-03");
        Book book2 = new Book(2,"software automation","jack",
                "intrduce software development",true,"2015-11-03");
        Book book3 = new Book(3,"Computer technology","hall",
                "computer technology knowledge ",true,"2014-12-03");
        result.add(book1);
        result.add(book2);
        result.add(book3);
        assertEquals(result,temp.bookList());
    }
}