package ie.atu.oop;

public class Main {
    public static void main(String[] args) {
        Book dune = new Book(
                "Dune", "Frank Herbert", 412);
        Book nineteenEightyFour = new Book(
                "1984", "George Orwell", 328);
        Book cleanCode = new Book(
                "Clean Code", "Robert C. Martin", 464);
        LibraryService service = new LibraryService();
        service.addBook(dune);
        service.addBook(nineteenEightyFour);
        service.addBook(cleanCode);
        System.out.println("Count: " + service.getBookCount());
        Book found = service.findBookByTitle("Dune");
        if (found != null) {
            System.out.println("Found: " + found.getTitle());
        }
        System.out.println("Loan Dune: "
                + service.loanBook("Dune", 7));
        System.out.println("Dune status: " + dune.getStatus());
        System.out.println("Loan missing: "
                + service.loanBook("The Hobbit", 7));
        System.out.println("Return Dune: "
                + service.returnBook("Dune"));
        System.out.println("Dune status: " + dune.getStatus());
        System.out.println("Remove Clean Code: "
                + service.removeBook("Clean Code"));
        System.out.println("Final count: "
                + service.getBookCount());
    }
}
