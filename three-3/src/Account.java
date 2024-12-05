public class Account {
    private double balance;
    private InterestStrategy interestStrategy;

    public Account(double balance, InterestStrategy interestStrategy) {
        this.balance = balance;
        this.interestStrategy = interestStrategy;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return interestStrategy.calculateInterest(balance);
    }

    // Other account methods like deposit, withdraw...
}
