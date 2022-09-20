public class Book {


    String bookName;
    String writer;

    int bookYear;

    String edition;
    boolean available;

    String loan;

    public Book (String bN, String writer, int bY, String edition) {
        this.bookName = bN;
        this.writer = writer;
        this.available = true;
        this.bookYear = bY;
        this.edition = edition;
    }

    boolean isAvailable () {

        return available;
    }

    @Override
    public String toString(){
        return "TITLE: " + bookName + ", AUTHOR: " + writer + ", Year: " + bookYear + ", Edition: " + edition + ", LOANED: " + !available;
    }




}




