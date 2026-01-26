public class Program {
    public static void main(String[] args) {
        SalaryService salaryService1 = new SalaryService();
        SalaryService salaryService2 = new SalaryService();

        double salaryValue1 = salaryService1.calculate(1200.0d, 150.0d, 3000.0d, 10.0d);
        double salaryValue2 = salaryService2.calculate(2500.0d, 350.0d, 10000.0d, 15.0d);

        System.out.printf("Salary 1: %.2f\n", salaryValue1);
        System.out.printf("UUID 1: %s\n\n", salaryService1.getUuid());

        System.out.printf("Salary 2: %.2f\n", salaryValue2);
        System.out.printf("UUID 2: %s\n", salaryService2.getUuid());
    }
}