package providers;

public class Fedex implements ShippingProvider {
    public Shipping calculateShipping(double weight, double value) {
        return new Shipping(weight > 1000.0d ? value * 0.1d : value * 0.05d,
            getShippingProviderType());
    }

    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.FEDEX;
    }
}