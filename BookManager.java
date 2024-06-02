import java.util.ArrayList;
import java.util.List;

public class BookManager implements BookOperations {
    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
        books.add(new Book("Dziady", "Adam Mickiewicz", "ISBN1", 1823));
        books.add(new Book("Chlopi", "Wladyslaw Raymont", "ISBN2", 1904));
        books.add(new Book("Noce i dnie", "Maria Dabrowska", "ISBN3", 1934));
        books.add(new Book("Wesele", "Stanislaw Wyspianski", "ISBN4", 1901));
        books.add(new Book("Nad Niemnem", "Eliza Orzeszkowa", "ISBN5", 1888));
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String isbn) {
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    @Override
    public void updateBook(String isbn, Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.set(i, updatedBook);
                break;
            }
        }
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}