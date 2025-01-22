package library;

public class Book {
    private String title;
    private int copies;
    private String author;

    public Book(String title, int copies, String author) {
        this.title = title;
        this.copies = copies;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public int getCopies() {
        return copies;
    }

    public String getAuthor() {
        return author;
    }

    public void borrowCopy() {
        if (copies > 0) {
            copies--;
        }
    }

    public void returnCopy() {
        copies++;
    }
}