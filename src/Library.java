import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    static ArrayList<Book> listOfBooks = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public static void addInitialBooks() {
        addBookToLibrary(new Book("The Lord of the Rings", "RR Tolkien",1788, "1"));
        addBookToLibrary(new Book("A Game of Thrones", "George R.R Martin",1928, "2"));
        addBookToLibrary(new Book("Java for dummies", "B Burd",1838, "3"));
        addBookToLibrary(new Book("Java for experts", "B Burd",8383,"4"));
        addBookToLibrary(new Book("Harry Potter", "JK.Rowling",2002, "5"));

    }

    public static void addBookToLibrary(Book newBook) {
        //denna funktionen lägger till en ny book
        listOfBooks.add(newBook);
    }

    public void searchBook(String searchInput) {

        for (Book b : listOfBooks) {
            if (b.bookName.equalsIgnoreCase(searchInput)) {
                System.out.println("Found book: " + b);

                if (b.isAvailable() == true) {

                    System.out.println("Do you want to borrow it? yes/no?");
                    String wantsToBorrow = scan.nextLine();

                    if (wantsToBorrow.equalsIgnoreCase("yes")) {
                        loan(b);
                        break;
                    }
                }
            }
        }
    }

    public static void loan(Book book) {

        if (book.isAvailable() == true) {
            book.available = false;
            System.out.println("You have now borrowed the book");
        } else {
            System.out.println("Not available");
        }
    }


    public void printListOfBooks() {

        //Loopar igenom listan av böcker (listOfBooks)

        for (Book book : listOfBooks) {

            //här printar vi ut varje Book.toString()
            // .toString är overridat i Book.java så vi kan printa ut det vi vill se

            if(book.isAvailable() == true) {
            System.out.println(book);
            System.out.println();
            }
        }
    }


    public void returnBook(String bookToReturn) {

        for (Book b : listOfBooks) {
            if (b.bookName.equalsIgnoreCase(bookToReturn)) {

                if (b.isAvailable() == false) {
                    b.available = true;
                    System.out.println("You have now returned the book.");
                } else {
                    System.out.println("Could not find the book.");
                }
            }
        }
    }
}

