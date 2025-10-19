public class Payroll {
    public static double calculateNet(Employee employee,
        SalaryCalculator salaryCalculator) {
        return salaryCalculator.calculate(employee.getSalary());
    }
}