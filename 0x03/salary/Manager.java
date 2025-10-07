public class Manager extends Employee {
    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        if (department.reachedTarget()) {
            return  getFixedSalary() * 0.2d
            + (department.getAchievedTargetValue() - department.getTargetValue()) * 0.01d;
        }

        return 0.0d;
    }
}