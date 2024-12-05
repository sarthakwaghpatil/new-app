public class SavingsInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        // Savings accounts have a specific interest calculation, e.g., 5%
        return balance * 0.05;
    }
}
