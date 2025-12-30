import food.Food;
import mood.*;

public class Character {
    private int happinessPoints;

    @Override
    public String toString() {
        return String.format(
            "%d - %s",
            this.happinessPoints,
            getCurrentMood().getClass().getSimpleName()
        );
    }

    public void eat(Food[] foods) {
        for (Food food : foods) {
            setHappinessPoints(this.happinessPoints + food.getHappinessPoints());
        }
    }

    public Mood getCurrentMood() {
        if (this.happinessPoints < -5) {
            return new Angry();
        } else if (this.happinessPoints <= 0) {
            return new Sad();
        } else if (this.happinessPoints <= 15) {
            return new Happy();
        } else {
            return new VeryHappy();
        }
    }

    public int getHappinessPoints() {
        return this.happinessPoints;
    }

    public void setHappinessPoints(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }
}