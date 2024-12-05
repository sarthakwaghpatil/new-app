public class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        // Checking account uses standard interest calculation
        super(balance, new StandardInterest());
    }
}
