import java.util.function.Supplier;
import java.util.function.Consumer;

public class Product {
    private double price;
    private String name;
    private double markupPercentage;
    public Supplier<Double> priceWithMarkup
        = () -> this.price * (1.0d + markupPercentage / 100.0d);
    public Consumer<Double> updateMarkup = (value) -> this.markupPercentage = value;

    public Product(double price, String name) {
        setPrice(price);
        setName(name);
        setMarkupPercentage(10.0d);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getMarkupPercentage() {
        return this.markupPercentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMarkupPercentage(double markupPercentage) {
        this.markupPercentage = markupPercentage;
    }
}