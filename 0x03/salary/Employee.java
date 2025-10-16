public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        setFixedSalary(fixedSalary);
    }

    public double calculateBonus(Department department) {
        return department.reachedTarget() ? this.fixedSalary * 0.1d : 0.0d;
    }

    public double calculateTotalSalary(Department department) {
        return this.fixedSalary + calculateBonus(department);
    }

    public double getFixedSalary() {
        return this.fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
}