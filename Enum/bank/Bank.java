import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        setName(name);
        setBranches(new ArrayList<Branch>());
    }

    public Branch findBranch(String branchName) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }

        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        }

        this.branches.add(new Branch(branchName));

        return true;
    }

    public boolean addCustomer(
        String branchName,
        String customerName,
        double initialTransactionAmount
    ) {

        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        return branch.newCustomer(customerName, initialTransactionAmount);
    }

    public boolean addCustomerTransaction(
        String branchName,
        String customerName,
        double transactionAmount
    ) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        return branch.addCustomerTransaction(customerName, transactionAmount);
    }

    public boolean listCustomers(String branchName, boolean printsTransactions) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        int customerIndex = 1;
        int transactionIndex = 1;

        for (Customer customer : branch.getCustomers()) {
            System.out.printf("Client: %s [%d]\n", customer.getName(), customerIndex);

            if (printsTransactions) {
                for (double transaction : customer.getTransactions()) {
                    System.out.printf("[%d] value %.2f\n", transactionIndex, transaction);
                    transactionIndex++;
                }
                transactionIndex = 1;
            }
            customerIndex++;
        }

        return true;
    }

    public String getName() {
        return this.name;
    }

    public List<Branch> getBranches() {
        return this.branches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}