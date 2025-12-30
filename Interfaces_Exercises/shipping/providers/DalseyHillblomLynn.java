package providers;

public class DalseyHillblomLynn implements ShippingProvider {
    public static final double WEIGHT_THRESHOLD_GRAMS = 5000.0d;
    public static final double SHIPPING_RATE_ABOVE_THRESHOLD = 0.12d;
    public static final double SHIPPING_RATE_BELOW_THRESHOLD = 0.04d;

    public Shipping calculateShipping(double weight, double value) {
        return new Shipping(
            value * (
                weight > WEIGHT_THRESHOLD_GRAMS
                ? SHIPPING_RATE_ABOVE_THRESHOLD
                : SHIPPING_RATE_BELOW_THRESHOLD
            ),
            getShippingProviderType()
        );
    }

    public ShippingProviderType getShippingProviderType() {
        return ShippingProviderType.DHL;
    }
}