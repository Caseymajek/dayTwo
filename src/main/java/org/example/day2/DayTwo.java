package org.example.day2;

import org.example.day2.library.Book;

public class DayTwo {

    public static void main(String[] args) {
        String hello = new String("hello");
        System.out.println("This is the first" + hello + "this is second hello with ju");


        Book libraryBook = new Book();
        libraryBook.setName("Journal");
        System.out.println(libraryBook.getName());


    }
}
