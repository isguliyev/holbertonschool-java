import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

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

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
}