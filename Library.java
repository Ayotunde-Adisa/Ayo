package library;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Library {
    private List<Book> books;
    private PriorityQueue<BookRequest> requests;

    public Library() {
        books = new ArrayList<>();
        requests = new PriorityQueue<>(new RequestComparator());
    }
    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void requestBook(Person person, String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                requests.add(new BookRequest(person, book));
                return;
            }
        }
        System.out.println("Book not found in library.");
    }

    public List<String> processRequests() {
        List<String> messages = new ArrayList<>();
        while (!requests.isEmpty()) {
            BookRequest request = requests.poll();
            Book book = request.getBook();
            if (book.getCopies() > 0) {
                book.borrowCopy();
                messages.add(request.getRequester().getName() + " has borrowed " + book.getTitle());
            } else {
                messages.add("Book Taken: " + request.getRequester().getName() + " requested " + book.getTitle() + " but it is already borrowed.");
            }
        }
        return messages;
    }
}