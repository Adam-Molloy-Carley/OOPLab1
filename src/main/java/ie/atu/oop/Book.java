package ie.atu.oop;

public class Book
{
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Is Book Available: " + available);
        System.out.println("\n");
    }

    public void borrowBook()
    {
        if(available==true) {
            available = false;
            System.out.println(title + " borrowed successfully ");
        }

        else {
            System.out.println(title + " on Loan ");
        }
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


