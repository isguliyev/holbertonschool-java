public class Department {
    private double targetValue;
    private double achievedTargetValue;

    public Department(double targetValue, double achievedTargetValue) {
        setTargetValue(targetValue);
        setAchievedTargetValue(achievedTargetValue);
    }

    public boolean reachedTarget() {
        return getAchievedTargetValue() >= getTargetValue();
    }

    public double getTargetValue() {
        return this.targetValue;
    }

    public double getAchievedTargetValue() {
        return this.achievedTargetValue;
    }

    public void setTargetValue(double targetValue) {
        this.targetValue = targetValue;
    }

    public void setAchievedTargetValue(double achievedTargetValue) {
        this.achievedTargetValue = achievedTargetValue;
    }
}