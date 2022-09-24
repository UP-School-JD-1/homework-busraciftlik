package com.busraciftlik.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Küçük şeyler", 150, "Kurgu"));
        books.add(new Book("Aşk ve Ceza", 100, "Kurgu"));

        for (Book book : books) {
            System.out.println(book.title + " : " + book.page);
        }
        books.sort(new BookComparator());
        System.out.println("\n Ordering books by page\n");
        for (Book book : books) {
            System.out.println(book.title + " : " + book.page);

        }
        Comparator<Book> comparator = ((o1, o2) -> o1.getPage()- o2.getPage());
        BinaryOperator<Book> maxOperator = BinaryOperator.maxBy(comparator);

        System.out.println("Max: " + maxOperator.apply(new Book("Küçük şeyler", 150, "Kurgu"),new Book("Aşk ve Ceza", 100, "Kurgu")));
    }

}

