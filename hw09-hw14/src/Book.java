public class Book {
    BookType bookType;
    Author author;
    String title;
    int page;
    boolean isHardCover;
    int currentPage;

    Book(String title, int page, Author author, BookType bookType, boolean isHardCover){
        this.title = title;
        this.page = page;
        this.author = author;
        this.bookType = bookType;
        this.isHardCover = isHardCover;
        this.currentPage = 0;
    }
    public int getCurrentPage() {

        return currentPage;
    }
}
