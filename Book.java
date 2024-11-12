
public class Book {

    private String name, author;
    private String status = "Available";
    static int count = 0;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        count++;
    }

    String showName() {
        return (name);
    }

    String showAuthor() {
        return (author);
    }

    String showStatus() {
        return (status);
    }

    void changeStatus() {
        this.status = "Borrowed";
    }

}
