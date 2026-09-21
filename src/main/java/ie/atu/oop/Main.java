package ie.atu.oop;


public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book();
        firstBook.title = "DarkBlade";
        firstBook.author = "Dan-Abnett";
        firstBook.pageCount = 400;

        firstBook.displayDetails();

        Book secondBook = new Book();
        secondBook.title = "VerminSlayer";
        secondBook.author = "William-King";
        firstBook.pageCount = 500;

        secondBook.displayDetails();
    }
}