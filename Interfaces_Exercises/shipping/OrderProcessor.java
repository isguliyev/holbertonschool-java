import providers.ShippingProvider;

public class OrderProcessor {
    private ShippingProvider shippingProvider;

    public OrderProcessor(ShippingProvider shippingProvider) {
        setShippingProvider(shippingProvider);
    }

    public void process(Order order) {
        order.setShipping(
            this.shippingProvider.calculateShipping(
                order.getWeight(),
                order.getTotal()
            )
        );
    }

    public ShippingProvider getShippingProvider() {
        return this.shippingProvider;
    }

    public void setShippingProvider(ShippingProvider shippingProvider) {
        this.shippingProvider = shippingProvider;
    }
}