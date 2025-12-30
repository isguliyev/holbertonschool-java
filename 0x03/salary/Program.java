public class Program {
    public static void main(String[] args) {
        Department engineeringDepartment = new Department(1000.0d, 1100.0d);
        Department documentationDepartment = new Department(1000.0d, 800.0d);

        Employee engineeringEmployee1 = new Employee(2300.0d);
        Employee engineeringEmployee2 = new Employee(3650.0d);

        Manager engineeringManager = new Manager(5800.0d);

        Employee documentationEmployee1 = new Employee(2500.0d);
        Employee documentationEmployee2 = new Employee(3000.0d);

        Manager documentationManager = new Manager(4980.0d);

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            engineeringEmployee1.getFixedSalary(),
            engineeringEmployee1.calculateTotalSalary(engineeringDepartment),
            engineeringEmployee1.calculateBonus(engineeringDepartment)
        );

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            engineeringEmployee2.getFixedSalary(),
            engineeringEmployee2.calculateTotalSalary(engineeringDepartment),
            engineeringEmployee2.calculateBonus(engineeringDepartment)
        );

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            engineeringManager.getFixedSalary(),
            engineeringManager.calculateTotalSalary(engineeringDepartment),
            engineeringManager.calculateBonus(engineeringDepartment)
        );

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            documentationEmployee1.getFixedSalary(),
            documentationEmployee1.calculateTotalSalary(documentationDepartment),
            documentationEmployee1.calculateBonus(documentationDepartment)
        );

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            documentationEmployee2.getFixedSalary(),
            documentationEmployee2.calculateTotalSalary(documentationDepartment),
            documentationEmployee2.calculateBonus(documentationDepartment)
        );

        System.out.printf(
            "Fixed Salary: %.2f - Total Salary: %.2f - Bonus Amount: %.2f\n",
            documentationManager.getFixedSalary(),
            documentationManager.calculateTotalSalary(documentationDepartment),
            documentationManager.calculateBonus(documentationDepartment)
        );
    }
}