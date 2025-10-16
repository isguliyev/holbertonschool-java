import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        setName(name);
        setCustomers(new ArrayList<Customer>());
    }

    public boolean newCustomer(String customerName,
        double initialTransactionAmount) {

        if (findCustomer(customerName) != null) {
            return false;
        }

        this.customers.add(new Customer(customerName, initialTransactionAmount));

        return true;
    }

    public boolean addCustomerTransaction(String customerName,
        double transactionAmount) {

        Customer customer = findCustomer(customerName);

        if (customer == null) {
            return false;
        }

        customer.addTransaction(transactionAmount);

        return true;
    }

    public Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }

        return null;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}