package library;
import java.util.List;

public class Main {
     public static void main(String[] args) {
            Library library = new Library();

            Book book1 = new Book("Java Programming", 3, "John Doe");
            Book book2 = new Book("Data Structures", 2, "Jane Smith");

            library.addBook(book1);
            library.addBook(book2);

            Teacher teacher = new Teacher("Mr. Smith");
            Student junior = new Student("Alice", 1, false);
            Student senior = new Student("Bob", 2, true);

            library.requestBook(junior, "Java Programming");
            library.requestBook(senior, "Java Programming");
            library.requestBook(teacher, "Java Programming");
            library.requestBook(junior, "Data Structures");
            library.requestBook(senior, "Data Structures");
            library.requestBook(teacher, "Data Structures");

            List<String> messages = library.processRequests();
            for (String message : messages) {
                System.out.println(message);
            }
        }
    }