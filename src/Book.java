public class Book {


    String bookName;
    String writer;
    int bookYear;
    String edition;
    boolean available;

    String loan;

    public Book (String bN, String writer) {
        this.bookName = bN;
        this.writer = writer;
        this.available = true;

    }

    boolean isAvailable () {

        return available;
    }

    @Override
    public String toString(){
        return "TITLE: " + bookName + ", AUTHOR: " + writer + ", LOANED: " + !available;
    }




}




