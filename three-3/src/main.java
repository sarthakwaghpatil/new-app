public class main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(1000);  // Balance of 1000 in a savings account
        Account checkingAccount = new CheckingAccount(2000);  // Balance of 2000 in a checking account

        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Checking Account Interest: " + checkingAccount.calculateInterest());
    }
}
