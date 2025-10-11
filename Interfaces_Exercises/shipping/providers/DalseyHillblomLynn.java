package providers;

public class DalseyHillblomLynn implements ShippingProvider {
    public Shipping calculateShipping(double weight, double value) {
        return new Shipping(weight > 5000.0d ? value * 0.12d : value * 0.04d,
            getShippingProviderType());
    }

    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}