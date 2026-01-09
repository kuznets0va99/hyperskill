import java.util.Scanner;

// Creating class
class Book {
    // set up three private properties
    private String title;
    private String author;
    private int numberOfPages;

    // getters and setters go here
    // Remember:
    // 1. They must not allow empty string for 'title' and 'author'.
    // 2. They must not allow negative or zero value for 'numberOfPages'.
    // 3. If such values are attempted to be set, the property should remain unchanged.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null){
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null){
            this.author = author;
        }
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0){
            this.numberOfPages = numberOfPages;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        String Title = scanner.nextLine();
        String Author = scanner.nextLine();
        int numberOfPages = scanner.nextInt();
        book.setTitle(Title);
        book.setAuthor(Author);
        book.setNumberOfPages(numberOfPages);

        // Then use the accessor methods to get and print these values.
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}