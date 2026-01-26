import java.util.List;
import java.util.ArrayList;

public class CoffeeBeverage extends Beverage {
    @Override
    public List<String> getIngredients() {
        return new ArrayList<String>(List.of("coffee"));
    }

    @Override
    public double getPrice() {
        return 5.35d;
    }
}