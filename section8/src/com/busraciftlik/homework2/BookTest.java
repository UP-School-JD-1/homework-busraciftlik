package com.busraciftlik.homework2;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Küçük şeyler",150,"Kurgu"));
        books.add(new Book("Aşk ve Ceza",100,"Kurgu"));

        for(Book book : books) {
            System.out.println(book.title+" : " + book.page);
        }
        books.sort(new BookComparator());
        System.out.println("\n Ordering books by page\n");
        for(Book book : books) {
            System.out.println(book.title+" : " + book.page);
        }
    }
}
