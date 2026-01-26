import java.util.List;
import java.util.ArrayList;

public class MilkBeverage extends BeverageDecorator {
    public MilkBeverage(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<String>(decoratedBeverage.getIngredients());
        ingredients.add("milk");
        return ingredients;
    }

    @Override
    public double getPrice() {
        return decoratedBeverage.getPrice() + 3.2d;
    }
}
