import exceptions.InvalidOperationException;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        setAccountNumber(accountNumber);
        setBalance(0.0d);
        setAnnualInterestRate(annualInterestRate);
    }

    @Override
    public String toString() {
        return String.format("Account %s - balance: %.2f", this.accountNumber, this.balance);
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0.0d) {
            throw new InvalidOperationException("Deposit amount must be greater than 0");
        }

        setBalance(this.balance + value);
    }

    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0.0d) {
            throw new InvalidOperationException("Withdrawal amount must be greater than 0");
        }

        if (this.balance < value) {
            throw new InvalidOperationException(
                "Withdrawal amount must be less than the current balance"
            );
        }

        this.balance -= value;
    }

    public double calculateMonthlyFee() {
        return Math.min(this.balance * 0.1d, 10.0d);
    }

    public double calculateMonthlyInterest() {
        if (this.balance < 0.0d) {
            return 0.0d;
        }

        return this.balance * this.annualInterestRate / 1200.0d;
    }

    public void applyMonthlyUpdate() {
        this.balance = this.balance - calculateMonthlyFee() + calculateMonthlyInterest();
    }

    public  String getAccountNumber() {
        return this.accountNumber;
    }

    public  double getBalance() {
        return this.balance;
    }

    public  double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}