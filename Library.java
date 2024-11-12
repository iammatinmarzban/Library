
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = {
            new Book("1984", "George Orwell"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("Pride and Prejudice", "Jane Austen"),
            new Book("Moby-Dick", "Herman Melville")
        };
        System.out.println("search for a Book Title: ");
        String input = scanner.next();
        for (int i = 0; i < books.length; i++) {
            if (books[i].showName().toLowerCase().contains(input)) {
                System.out.println(books[i].showName());
                System.out.println(books[i].showAuthor());
                System.out.println(books[i].showStatus());
                System.out.println("Do you want to borrow the book?(Y/N)");
                String q = scanner.next();
                if ("y".equals(q)) {
                    books[i].changeStatus();
                } else {
                    break;
                }
                System.out.println(books[i].showStatus());

            }
        }
        // System.out.println(Book.count);

    }

}
