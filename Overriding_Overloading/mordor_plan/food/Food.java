package food;

public abstract class Food {
    private int happinessPoints;

    public Food(int happinessPoints) {
        setHappinessPoints(happinessPoints);
    }

    public int getHappinessPoints() {
        return this.happinessPoints;
    }

    private void setHappinessPoints(int happinessPoints) {
        this.happinessPoints = happinessPoints;
    }
}