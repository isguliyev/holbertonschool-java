public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee(2360.0d);

        double netSalary90percent = Payroll.calculateNet(employee1, x -> x * 0.9d);
        double netSalaryPlus50 = Payroll.calculateNet(employee1, x -> x + 50.0d);
        double netSalaryPlus10percent = Payroll.calculateNet(employee1, x -> x * 1.1d);

        System.out.printf("%.2f - %.2f\n", employee1.getSalary(), netSalary90percent);
        System.out.printf("%.2f - %.2f\n", employee1.getSalary(), netSalaryPlus50);
        System.out.printf("%.2f - %.2f\n", employee1.getSalary(), netSalaryPlus10percent);
    }
}