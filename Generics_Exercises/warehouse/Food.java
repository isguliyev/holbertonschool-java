public class Food {
    private String name;
    private double calories;
    private double price;

    public Food(String name, double calories, double price) {
        setName(name);
        setCalories(calories);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format(
            "[%s] %f $ %f",
            this.name,
            this.calories,
            this.price
        );
    }

    public String getName() {
        return this.name;
    }

    public double getCalories() {
        return this.calories;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}