public class Program {
    public static void main(String[] args) {
        Bank bank = new Bank("Wells Fargo");

        bank.addBranch("Washington");

        bank.addCustomer("Washington", "John Bannons", 50.05d);
        bank.addCustomer("Washington", "Jane Doe", 175.34d);
        bank.addCustomer("Washington", "Jackson Percy", 220.12d);

        bank.addCustomerTransaction("Washington", "Jane Doe", 44.22d);
        bank.addCustomerTransaction("Washington", "Jane Doe", 12.44d);
        bank.addCustomerTransaction("Washington", "Jackson Percy", 1.65d);

        bank.listCustomers("Washington", true);
    }
}