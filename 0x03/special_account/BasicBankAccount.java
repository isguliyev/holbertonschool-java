import exceptions.*;

public class BasicBankAccount {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public BasicBankAccount(String accountNumber, double annualInterestRate) {
        setAccountNumber(accountNumber);
        setBalance(0.0d);
        setAnnualInterestRate(annualInterestRate);
    }

    public void deposit(double value) throws InvalidOperationException {
        if (value <= 0.0d) {
            throw new InvalidOperationException(
                "Deposit amount must be greater than 0");
        }

        setBalance(this.balance + value);
    }

    public void withdraw(double value) throws InvalidOperationException {
        if (value <= 0.0d) {
            throw new InvalidOperationException(
                "Withdrawal amount must be greater than 0");
        }

        if (this.balance < value) {
            throw new InvalidOperationException(
                "Withdrawal amount must be less than the current balance");
        }

        setBalance(this.balance - value);
    }

    public double calculateMonthlyFee() {
        return this.balance * 0.1d < 10.0d ? this.balance * 0.1d : 10.0d;
    }

    public double calculateMonthlyInterest() {
        if (this.balance < 0.0d) {
            return 0.0d;
        }

        return this.balance * this.annualInterestRate / 1200.0d;
    }

    public void applyMonthlyUpdate() {
        setBalance(this.balance - calculateMonthlyFee() + calculateMonthlyInterest());
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