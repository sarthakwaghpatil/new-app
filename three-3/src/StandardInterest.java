public class StandardInterest implements InterestStrategy {
    @Override
    public double calculateInterest(double balance) {
        // Standard accounts have a different interest rate, e.g., 2%
        return balance * 0.02;
    }
}
