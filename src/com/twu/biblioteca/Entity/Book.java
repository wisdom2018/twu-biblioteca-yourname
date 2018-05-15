package com.twu.biblioteca.Entity;

import java.util.ArrayList;

public class Book {
    int bookID;
    String bookName;
    String bookAuthor;
    String bookDescription;
    boolean bookStatus;                                 //bookStatus 为true表示可借，否则为false表示不可借
    String bookPublishTime;

    ArrayList<Book> bookList = new ArrayList<Book>();

    public Book(int bookID, String bookName, String bookAuthor, String bookDescription, boolean bookStatus, String bookPublishTime) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookStatus = bookStatus;
        this.bookPublishTime = bookPublishTime;
    }

    public Book() {
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public Boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookPublishTime() {
        return bookPublishTime;
    }

    public void setBookPublishTime(String bookPublishTime) {
        this.bookPublishTime = bookPublishTime;
    }

    public ArrayList<Book> bookList(){
        Book book1 = new Book(1,"software development","wisdom",
                "intrduce software development",true,"2016-12-03");
        Book book2 = new Book(2,"software automation","jack",
                "intrduce software development",true,"2015-11-03");
        Book book3 = new Book(3,"Computer technology","hall",
                "computer technology knowledge ",true,"2014-12-03");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        return bookList;
    }
}
