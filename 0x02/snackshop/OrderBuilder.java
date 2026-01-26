public class OrderBuilder extends OrderAbstractBuilder {
    private Order order;

    public OrderBuilder() {
        this.order = new Order();
    }

    public void setSnack(SnackType type) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(OrderItemType.SNACK);
        orderItem.setName(OrderItemType.SNACK.name() + " " + type.name());
        this.order.addItemInBox(orderItem);
    }

    public void setFries(FriesSize size) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(OrderItemType.FRIES);
        orderItem.setName(OrderItemType.FRIES.name() + " " + size.name());
        this.order.addItemInBox(orderItem);
    }

    public void setToy(ToyType type) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(OrderItemType.TOY);
        orderItem.setName(OrderItemType.TOY.name() + " " + type.name());
        this.order.addItemInBox(orderItem);
    }

    public void setDrink(DrinkType type) {
        OrderItem orderItem = new OrderItem();
        orderItem.setType(OrderItemType.DRINK);
        orderItem.setName(OrderItemType.DRINK.name() + " " + type.name());
        this.order.addItemOutOfBox(orderItem);
    }

    public Order build() {
        return this.order;
    }
}