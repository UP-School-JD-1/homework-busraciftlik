public class ReaderTest {

       public static void main(String[] args) {

        /*Reader reader1 = new Reader();
        reader1.name = "Büşra";
        reader1.age = 26;
        reader1.gender = 'K';

        Author author = new Author();
        author.name = "Ayşe Kulin";

        Book book1 = new Book();
        book1.title = "Adı : Aylin";
        book1.page = 398;
        book1.type = "Kurgu";
        book1.currentPage = 100;
        book1.isHardCover = true;
        book1.author = author;

        Book book2 = new Book();
        book2.title = "Güzel Günler";
        book2.page = 365;
        book2.type = "Kurgu";
        book2.currentPage = 0;
        book2.isHardCover = true;
        book2.author = author;

        author.books[0] = book1;
        author.books[2] = book2;

        for (Book book : author.books) {
            if (book != null) {
                System.out.println(book.title);
            }
        }
        reader1.read(book1);*/
        Reader reader = new Reader();
        reader.name = "Zeynep";
        reader.age = 15;
        //reader.gender = '0';
        //reader.setGender('0');
        System.out.println(reader.gender);
    }
}
