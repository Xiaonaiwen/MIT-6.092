public class Library {
    // Add the missing implementation to this class
    Book[] books = new Book[1000];
    int index = 0;
    String address; 
    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }

    public Library(String libraryAddress){
        address = libraryAddress;
    }

    public static void printOpeningHours(){
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void addBook(Book book){
        books[index] = book;
        index++;
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String name){
        int num = 0;
        while (num < index){
            if (name.equals(books[num].getTitle())){
                if (books[num].isBorrowed()){
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                }
                else{
                    books[num].borrowed = true;
                    System.out.println("You successfully borrowed The Lord of the Rings");
                    return;
                }
            }
            num++;
        }
        System.out.println("Sorry, this book is not in our catalog.");
    }

    public void printAvailableBooks(){
        int count = 0;

        int num = 0;
        while (num < index){
            if (!books[num].isBorrowed()){
                System.out.println(books[num].getTitle());
                count++;
            }
            num++;
        }   
        
        if (count == 0){
            System.out.println("No book in catalog");
        }
    }

    public void returnBook(String name){
        int num = 0;
        while (num < index){
            if (name.equals(books[num].getTitle())){
                books[num].returned();
                System.out.println("You successfully returned " + books[num].getTitle());
                return;
            }
            num++;
        }
    }
} 