package ie.atu.oop;


public class Main {
    public static void main(String[] args) {

        Book firstBook = createBook("Dune", "Frank-Herbert", 412);
        Book secondBook = createBook("VerminSlayer", "William-King", 500);
        Book thirdBook = createBook("DarkBlade", "Dan-abnett", 350);

        firstBook.displayDetails();
        secondBook.displayDetails();
        thirdBook.displayDetails();
        firstBook.borrowBook();
        firstBook.borrowBook();

        secondBook.displayDetails();
        firstBook.displayDetails();


    }
        private static Book createBook(String title, String author, int pageCount)
        {
            Book book = new Book();
            book.title = title;
            book.author = author;
            book.pageCount = pageCount;
            return book;
        }
}

