package ie.atu.oop;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private static final int MAX_LOAN_DAYS = 14;
    private final List<Book> books = new ArrayList<>();

    public boolean loanBook(String title, int loanDays) {
        if (loanDays < 1 || loanDays > MAX_LOAN_DAYS) {
            throw new IllegalArgumentException(
                    "Loan days must be from 1 to 14");
        }
        Book book = findBookByTitle(title);
        if (book == null) {
            return false;
        }
        book.borrowBook();
        return true;
    }

    public boolean returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book == null) {
            return false;
        }
        book.returnBook();
        return true;
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException(
                    "Book must not be null");
        }
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public int getBookCount() {
        return books.size();
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
    public List<Book> getBooks() { return new ArrayList<>(books); }

    public boolean removeBook(String title){
        Book book = findBookByTitle(title);
        if(findBookByTitle(title)== null){
            return false;
        } else {
            books.remove(book);
            return true;
        }
    }
}
