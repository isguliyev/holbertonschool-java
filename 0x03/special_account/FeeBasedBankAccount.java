import exceptions.*;

public class FeeBasedBankAccount extends BasicBankAccount {
    private int transactionCount;

    public FeeBasedBankAccount(String accountNumber, double annualInterestRate) {
        super(accountNumber, annualInterestRate);
        setTransactionCount(0);
    }

    public void deposit(double value) throws InvalidOperationException {
        super.deposit(value);
        setBalance(getBalance() - 0.1d);
        setTransactionCount(this.transactionCount + 1);
    }

    public void withdraw(double value) throws InvalidOperationException {
        super.withdraw(value);
        setBalance(getBalance() - 0.1d);
        setTransactionCount(this.transactionCount + 1);
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }
}