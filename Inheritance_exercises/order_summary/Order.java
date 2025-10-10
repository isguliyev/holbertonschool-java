public class Order {
    private double discountPercentage;
    private ItemOrder[] items;

    Order(double discountPercentage, ItemOrder[] items) {
        setDiscountPercentage(discountPercentage);
        setItems(items);
    }

    public void presentOrderSummary() {
        double total = 0.0d;

        System.out.println("------- ORDER SUMMARY -------");

        for (ItemOrder itemOrder: items) {
            System.out.printf(
                "Type: %s  Title: %s  Price: %.2f  Quant: %d  Total: %.2f\n",
                itemOrder.getProduct().getClass().getSimpleName(),
                itemOrder.getProduct().getTitle(),
                itemOrder.getProduct().getNetPrice(),
                itemOrder.getQuantity(),
                itemOrder.getProduct().getNetPrice() * itemOrder.getQuantity());
            total += itemOrder.getProduct().getNetPrice() * itemOrder.getQuantity();
        }

        System.out.println("----------------------------");
        System.out.printf("DISCOUNT: %.2f\n",
            total * getDiscountPercentage() / 100);
        System.out.printf("TOTAL PRODUCTS: %.2f\n", total);
        System.out.println("----------------------------");
        System.out.printf("TOTAL ORDER: %.2f\n",
            total * (1.0d - getDiscountPercentage() / 100.0d));
        System.out.println("----------------------------");
    }

    public double calculateTotal() {
        double total = 0.0d;
        for (ItemOrder itemOrder : items) {
            total += itemOrder.getProduct().getNetPrice() * itemOrder.getQuantity();
        }

        return total * (1.0d - getDiscountPercentage() / 100.0d);
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