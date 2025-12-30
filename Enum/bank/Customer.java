import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, double initialTransactionAmount) {
        setName(name);
        setTransactions(new ArrayList<Double>());
        addTransaction(initialTransactionAmount);
    }

    public void addTransaction(double transactionAmount) {
        this.transactions.add(transactionAmount);
    }

    public String getName() {
        return this.name;
    }

    public List<Double> getTransactions() {
        return this.transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }
}