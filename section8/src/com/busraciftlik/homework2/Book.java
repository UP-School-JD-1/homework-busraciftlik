package com.busraciftlik.homework2;

public class Book {

    String title;
    int page;
    String type;

    public Book(String title, int page, String type) {
        this.title = title;
        this.page = page;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", type='" + type + '\'' +
                '}';
    }
}
