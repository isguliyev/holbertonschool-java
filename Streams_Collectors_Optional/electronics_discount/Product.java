public class Product {
    private int code;
    private String name;
    private ProductCategory category;
    private double price;

    public Product(
        int code,
        String name,
        ProductCategory category,
        double price
    ) {
        setCode(code);
        setName(name);
        setCategory(category);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format(
            "[%d] %s %s $ %.2f",
            this.code,
            this.name,
            this.category,
            this.price
        );
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public ProductCategory getCategory() {
        return this.category;
    }

    public double getPrice() {
        return this.price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}