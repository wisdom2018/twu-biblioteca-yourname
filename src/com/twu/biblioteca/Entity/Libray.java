package com.twu.biblioteca.Entity;

import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Libray {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private static final String MAIN_MENU_MSG = "MAIN MENU:";
    private static final String NOT_VALID_OPTION_MSG = "Select a valid option!";
    private static final String BORROW_A_BOOK_SUCCESS_MSG = "Thank you!Enjoy the book.";
    private static final String BORROW_A_BOOK_FAILURE_MSG = "That book is not available.";
    private static final String RETURN_A_BOOK_SUCCESS_MSG = "Thank you for returning the book.";
    private static final String RETURN_A_BOOK_FAILURE_MSG = "That is not a valid book to return";
    private static final String BOOK_DO_NOT_EXISTS_MSG = "The book does not exists";
    private ArrayList<Book> bookTotal = new ArrayList<Book>();
    private User currentUser;


    public void setUp() {
        Book book1 = new Book(1, "software development", "wisdom",
                "intrduce software development", true, "2016-12-03");
        Book book2 = new Book(2, "software automation", "jack",
                "intrduce software development", true, "2015-11-03");
        Book book3 = new Book(3, "Computer technology", "hall",
                "computer technology knowledge ", true, "2014-12-03");
        bookTotal.add(book1);
        bookTotal.add(book2);
        bookTotal.add(book3);

        new User("jack", "123");
        new User("William", "456");
        new User("snow", "789");
    }

    public void welcomeApp() {
        System.out.println("* * * * * * * * * * * * * * * * * * *");
        System.out.println("Welcome to Bangalore Public Library !");
        System.out.println("* * * * * * * * * * * * * * * * * * *");
        System.out.println();
    }

    public void showMainMenu() {
        System.out.println(MAIN_MENU_MSG);
        System.out.println("1) List Books");
        System.out.println("2) Borrow book");
        System.out.println("3) Return Books");
        System.out.println("4) Check out Book information");
        System.out.println("5) Quit");
        System.out.println();
    }

    public void selectMenu(String choose) {
        switch (choose) {
            case "1":
                listAllBooks();
                break;
            case "2":
                System.out.println("which one do you want to borrow?");
                System.out.println("please input a bookNumber:");
                int bookID = this.getBookID();
                borrowBook(bookID);
                break;
            case "3":
                System.out.println("you will return a book");
                returnBook(this.getBookID());
                break;
            case "4":
                displayBookInformation(this.getBookID());
                break;
            case "q":
                break;
            default:
                System.out.println(NOT_VALID_OPTION_MSG);
        }
    }

    public void mainMenu() {
        showMainMenu();
        String choose;
        do {
            showMainMenu();
            choose = getMenuChoose();
            selectMenu(choose);
        } while (!choose.equals("q"));
    }

    public String getMenuChoose() {
        Scanner sc = new Scanner(System.in);
        String choose = sc.next().toLowerCase();
        return choose;
    }

    public int getBookID() {                                    //according the id to look up whether the book is exists.
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    public void borrowBook(int bookID) {
        Book book;

        if (bookID <= 0 || bookID > bookTotal.size()) {
            System.out.println(BOOK_DO_NOT_EXISTS_MSG);
            return;
        }
        book = getABookByID(bookID);
        if (book.bookStatus) {
            book.setBookStatus(false);
            System.out.println(BORROW_A_BOOK_SUCCESS_MSG);
        } else {
            System.out.println(BORROW_A_BOOK_FAILURE_MSG);
        }
    }

    public void returnBook(int bookID) {
        if (bookID > 0 && bookID < bookTotal.size()) {
            if (this.getABookByID(bookID).bookStatus) {
                System.out.println(RETURN_A_BOOK_SUCCESS_MSG);
            } else {
                System.out.println(RETURN_A_BOOK_FAILURE_MSG);
                this.getABookByID(bookID).setBookStatus(true);
            }
        } else {
            System.out.println(RETURN_A_BOOK_FAILURE_MSG);
        }
    }

    public void addBook(Book book) {
        bookTotal.add(book);
    }

    public Book getABookByID(int index) {
        return bookTotal.get(index - 1);
    }

    public void listAllBooks() {
        Book bookList = new Book();
        ArrayList<Book> allBooks = new ArrayList<Book>();
        allBooks = bookList.bookList();
        for (Book book : allBooks) {
            System.out.println("bookname"+"\t"+"bookAuthor"+"\t"+"bookDescripy");
            System.out.println(book.bookName.toString() + " " + book.bookAuthor.toString() + " "
                    + book.bookDescription.toString());
        }
    }

    public void displayBookInformation(int bookID) {
        if (bookID > 0 && bookID < bookTotal.size()) {
            System.out.println(this.getABookByID(bookID).bookAuthor + "\t" +
                    this.getABookByID(bookID).bookDescription);
        } else {
            System.out.println(BOOK_DO_NOT_EXISTS_MSG);
        }
    }
}

