public class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        // Savings account uses the SavingsInterest strategy
        super(balance, new SavingsInterest());
    }
}
