package last;

public class Main {
    public static void main(String[] args) {
        // Create a BankAccount with an initial balance of 1000
        BankAccount realAccount = new BankAccount(1000);

        // Create a BankAccountProxy that wraps the real BankAccount
        BankAccountProxy accountProxy = new BankAccountProxy(realAccount);

        // Deposit 500 into the account
        accountProxy.deposit(500);  // Real account performs the deposit

        // Attempt to withdraw 1200 (will succeed)
        accountProxy.withdraw(1200);  // Real account performs the withdrawal

        // Attempt to withdraw 1500 (will fail due to insufficient funds)
        accountProxy.withdraw(1500);  // Proxy denies the withdrawal due to insufficient funds
    }
}

