package com.twu.biblioteca.Entity;

public class BibliotecaApp {
    public static void main(String[] args) {
        Libray libray = new Libray();
        System.out.println("hello");
        libray.setUp();
        libray.welcomeApp();
        System.out.println("please select your service");
        libray.mainMenu();
    }
}

