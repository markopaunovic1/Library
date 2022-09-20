import java.util.Scanner;

public class Main {

    static Library library = new Library();

    public static void main(String[] args) {

        //jag behöver starta igång ett library som en ny class
        //variable new Library()
       // library.addInitialBooks();
/*
        library.printListOfBooks();

        System.out.println();
        library.loan(library.listOfBooks.get(3));

        library.printListOfBooks();

        System.out.println();
        System.out.println("Nu listar vi den lånade boken ");
       // System.out.println(library.listOfBooks.get(3) + " denna boken vill jag se ");

        // scanner takes searchInput
*/

          Library.addInitialBooks();

          System.out.println();

        //  String book1 = new Book();

        while (true) {
            System.out.println("1. Add a book to the library");
            System.out.println("2. Search for a book by name");
            System.out.println("3. List all available books");
            System.out.println("4. Return a book");
            System.out.println("5. List all books");
            System.out.println("6. Loan a book");
            System.out.println("7. Quit");

        Scanner input = new Scanner(System.in);

        int select = input.nextInt();


            switch (select) {
                case 1:
                    //input aBookTitle = från scanner
                    Scanner bookInfo = new Scanner(System.in);
                    System.out.println("Name: ");
                    String aBookTitle = bookInfo.nextLine();

                    //input aWriter = från scanner
                    System.out.println("Author: ");
                    String aWriter = bookInfo.nextLine();

                    // Add book with our new title and author
                    Library.addBookToLibrary(new Book(aBookTitle, aWriter));

                    // List all available books
                    library.printListOfBooks();
                    break;

                case 2: // leta efter en bok
                    System.out.println("2. Search for a book by name");

                       Scanner userInput = new Scanner(System.in);
                      String searchInput = userInput.nextLine();

                    //Vi skickar med searchInput som kommer från scanner
                        library.searchBook(searchInput);
                      //  System.out.println("Do you want to loan the book?");



                    break;

                case 3:
                    System.out.println("3. List all available books");
                    library.printListOfBooks();
                    break;

                case 4:
                    System.out.println("4. Return a book");

                    break;

                case 5:
                    System.out.println("5. List all books");

                    break;

               /* case 6:
                    Scanner chooseBook = new Scanner(System.in);

                    System.out.println("6. Loan a book");
                    System.out.println("Choose a book to loan:");
                    library.printListOfBooks();
                    String search = chooseBook.nextLine();
                    // library.loan();
                    System.out.println();
                    break;*/

                case 7:
                    System.exit(0);

                    break;

                default:
                    System.out.println("Enter what you want");
                    break;
            }
        }
    }
}


