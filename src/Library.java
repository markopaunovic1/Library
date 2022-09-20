import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> listOfBooks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public static void addInitialBooks(){
        addBookToLibrary(new Book("The Lord of the Rings", "RR Tolkien"));
        addBookToLibrary(new Book("A Game of Thrones", "George R.R Martin"));
        addBookToLibrary(new Book("Java for dummies", "B Burd"));
        addBookToLibrary(new Book("Java for experts", "B Burd"));
        addBookToLibrary(new Book("Harry Potter", "JK.Rowling"));

    }

    public static void addBookToLibrary(Book newBook){
        //denna funktionen lägger till en ny book
        listOfBooks.add(newBook);
    }

    public void searchBook(String searchInput) {


        for (Book b: listOfBooks) {
            if (b.bookName.equals(searchInput)){
                System.out.println("Found book: " + b);

            if(b.isAvailable() == true){

            System.out.println("Do you want to borrow it? yes/no?");
            String wantsToBorrow = scan.nextLine();

            if (wantsToBorrow.equals("yes")) {
                loan(b);
                break;
            }}}}
    }


    public static void loan(Book book){

        if(book.isAvailable() == true){
            book.available = false;
            System.out.println("You have now borrowed the book");
        } else {
            System.out.println("Not available");
        }
    }

    public void printListOfBooks(){
        //Loopar igenom listan av böcker (listOfBooks)
        for (Book book: listOfBooks) {
            //här printar vi ut varje Book.toString()
            // .toString är overridat i Book.java så vi kan printa ut det vi vill se
            //if(book.isAvailable() == true) {
                System.out.println(book.toString());
                System.out.println();
            //}
        }
    }

    public void returnBook() {




    }
}

