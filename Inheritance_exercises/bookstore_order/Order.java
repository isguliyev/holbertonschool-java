public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    Order(double discountPercentage, ItemOrder[] items) {
        setDiscountPercentage(discountPercentage);
        setItems(items);
    }

    public double calculateTotal() {
        double total = 0.0d;
        for (ItemOrder itemOrder : items) {
            total += itemOrder.getProduct().getNetPrice() * itemOrder.getQuantity();
        }

        return total * (1.0d - this.discountPercentage / 100.0d);
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public ItemOrder[] getItems() {
        return this.items;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public void setItems(ItemOrder[] items) {
        this.items = items;
    }
}