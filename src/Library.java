import java.util.ArrayList;

public class Library {

    static ArrayList<Book> listOfBooks = new ArrayList<>();


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
        // kolla om boken finns i library
        for (Book book: listOfBooks) {
            //kolla om den book vi nuvarande loopar igenom
            //dens .bookName innehåller searchInput
            if(book.bookName.contains(searchInput)){
                System.out.println("Book found: ");
                System.out.println(book);
            }
            else  {
                book.equals(searchInput);
                System.out.println("No book was found.");
            }
        }
    }


    public static void loan(Book book){

        if(book.isAvailable() == true){
            System.out.println("It's available");
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

