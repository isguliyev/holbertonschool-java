import java.util.List;
import java.util.ArrayList;

public class SugarBeverage extends BeverageDecorator {
    public SugarBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<String>(decoratedBeverage.getIngredients());
        ingredients.add("sugar");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + 1.9d;
    }
}