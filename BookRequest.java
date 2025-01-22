package library;

public class BookRequest {

    private Person requester;
    private Book book;

    public BookRequest(Person requester, Book book) {
        this.requester = requester;
        this.book = book;
    }
    public Person getRequester() {
        return requester;
    }

    public Book getBook() {
        return book;
    }
}