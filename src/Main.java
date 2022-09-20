import java.util.Scanner;

public class Main {

    static Library library = new Library();

    public static void main(String[] args) {

        Library.addInitialBooks();

        System.out.println();

        while (true) {
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. Quit");

            Scanner input = new Scanner(System.in);
            int select = input.nextInt();


            switch (select) {
                case 1:
                    Scanner bookInfo = new Scanner(System.in);

                    System.out.println("Name: ");
                    String aBookTitle = bookInfo.nextLine();

                    System.out.println("Author: ");
                    String aWriter = bookInfo.nextLine();

                    System.out.println("Year: ");
                    int aBookYear = bookInfo.nextInt();
                    bookInfo.nextLine();

                    System.out.println("Edition: ");
                    String aEdition = bookInfo.nextLine();

                    // Add book with our new title, author, year and edition.
                    Library.addBookToLibrary(new Book(aBookTitle, aWriter, aBookYear, aEdition));

                    // List all available books
                    library.printListOfBooks();
                    break;

                case 2: // leta efter en bok
                    System.out.println("2. Search for a book by name");

                    Scanner userInput = new Scanner(System.in);
                    String searchInput = userInput.nextLine();

                    //Vi skickar med searchInput som kommer från scanner
                    library.searchBook(searchInput);

                    break;

                case 3:
                    System.out.println("3. List all available books");
                    library.printListOfBooks();
                    break;

                case 4:
                    System.out.println("4. Return a book");

                    Scanner returnBook = new Scanner(System.in);
                    System.out.println("Enter the name of the book your want to return: ");
                    String bookToReturn = returnBook.nextLine();
                    library.returnBook(bookToReturn);

                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choose between 1-5");
                    break;
            }
        }
    }
}


