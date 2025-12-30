package products;

public abstract class Product {
    private String title;
    private int year;
    private String country;
    private double grossPrice;

    public Product(String title, int year, String country, double grossPrice) {
        setTitle(title);
        setYear(year);
        setCountry(country);
        setGrossPrice(grossPrice);
    }

    public abstract double getNetPrice();

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public double getGrossPrice() {
        return this.grossPrice;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }
}