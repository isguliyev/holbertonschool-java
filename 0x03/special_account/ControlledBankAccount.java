public class ControlledBankAccount extends BasicBankAccount {
    private double minimumBalance;
    private double penaltyAmount;

    public ControlledBankAccount(
        String accountNumber,
        double annualInterestRate,
        double minimumBalance,
        double penaltyAmount) {
            super(accountNumber, annualInterestRate);
            setMinimumBalance(minimumBalance);
            setPenaltyAmount(penaltyAmount);
    }

    @Override
    public void applyMonthlyUpdate() {
        super.applyMonthlyUpdate();

        if (getBalance() < this.minimumBalance) {
            setBalance(getBalance() - this.penaltyAmount);
        }
    }

    public double getMinimumBalance() {
        return this.minimumBalance;
    }

    public double getPenaltyAmount() {
        return this.penaltyAmount;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public void setPenaltyAmount(double penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }
}