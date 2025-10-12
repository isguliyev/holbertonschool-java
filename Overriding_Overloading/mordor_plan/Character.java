import food.*;
import mood.*;

public class Character {
    private int happinessPoints;

    @Override
    public String toString() {
        return String.format("%d - %s",
            getHappinessPoints(),
            getCurrentMood().getClass().getSimpleName());
    }

    public void eat(Food[] foods) {
        for (Food food : foods) {
            setHappinessPoints(getHappinessPoints() + food.getHappinessPoints());
        }
    }

    public Mood getCurrentMood() {
        if (getHappinessPoints() < -5) {
            return new Angry();
        } else if (getHappinessPoints() <= 0) {
            return new Sad();
        } else if (getHappinessPoints() <= 15) {
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