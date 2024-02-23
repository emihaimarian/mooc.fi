
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Book book;
    private List<Book> books;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void start() {

        while (true) {

            System.out.print("Input the name of the book, empty stops: ");
            String bookTitle = scanner.nextLine();

            if (bookTitle.equals("")) {

                System.out.println(books.size() + " books in total.");

                System.out.println("Books:");

                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAgeRecomandation)
                        .thenComparing(Book::getBookName);

                Collections.sort(books, comparator);

                books.stream()
                        .forEach(Book -> System.out.println(Book));

                break;
            }

            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookTitle, ageRec));

        }
    }
}
