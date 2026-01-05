import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price)
            throws InvalidBookException, InvalidAuthorException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format(
            "Title: %s - Author: %s - Price: %.2f",
            this.title,
            this.author,
            this.price
        );
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) throws InvalidBookException {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        }

        this.title = title;
    }

    public void setAuthor(String author) throws InvalidAuthorException {
        if (author == null || author.isEmpty()) {
            throw new InvalidAuthorException("Invalid author name");
        }

        this.author = author;
    }

    public void setPrice(double price) throws InvalidBookException {
        if (price <= 0) {
            throw new InvalidBookException("Invalid book price");
        }

        this.price = price;
    }
}