package last;

public class BankAccountProxy implements BankAccountSubject {
    private BankAccount realAccount;

    public BankAccountProxy(BankAccount realAccount) {
        this.realAccount = realAccount;
    }

    @Override
    public void deposit(double amount) {
        realAccount.deposit(amount);  // Proxy delegates the deposit to the real account
    }

    @Override
    public void withdraw(double amount) {
        if (realAccount.getBalance() >= amount) {
            realAccount.withdraw(amount);  // Proxy checks balance before delegating the withdrawal
        } else {
            System.out.println("Withdrawal denied: Insufficient funds.");
        }
    }
}

