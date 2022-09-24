package com.busraciftlik.homework2;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.page < o2.page){
            return -1;
        } else if (o1.page > o2.page) {
            return 1;
        }else{
            return  0;
        }
    }
}
