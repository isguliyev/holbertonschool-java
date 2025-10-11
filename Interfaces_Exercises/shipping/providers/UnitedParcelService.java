package providers;

public class UnitedParcelService implements ShippingProvider {
    public Shipping calculateShipping(double weight, double value) {
        return new Shipping(weight > 2000.0d ? value * 0.07d : value * 0.045d,
            getShippingProviderType());
    }

    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.UPS;
    }
}