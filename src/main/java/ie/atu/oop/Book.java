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
        if(available==true)
        {
            available = false;
        }
    }
}


