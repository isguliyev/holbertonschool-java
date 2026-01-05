import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;

public class GoldEditionBook extends Book {
    public GoldEditionBook(String title, String author, double price)
            throws InvalidBookException, InvalidAuthorException {
        super(title, author, price);
    }

    public double getPrice() {
        return super.getPrice() * 1.3d;
    }
}