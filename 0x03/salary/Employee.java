public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        setFixedSalary(fixedSalary);
    }

    public double calculateBonus(Department department) {
        return department.reachedTarget() ? getFixedSalary() * 0.1d : 0;
    }

    public double calculateTotalSalary(Department department) {
        return getFixedSalary() + calculateBonus(department);
    }

    public double getFixedSalary() {
        return this.fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}