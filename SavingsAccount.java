public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.025; // 2.5%
    private static int savingsNumber = 0;
    private String accountNumber;

    // Create constructor
    public SavingsAccount(String name, double initialBalance) {
        super(name, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Create method to calculate and post interest
    public void postInterest() {
        double interest = getBalance() * INTEREST_RATE / 12;
        deposit(interest);
    }

    // Override getAccountNumber method
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount oldAccount, double initialBalance) {
        super(oldAccount, initialBalance);
        savingsNumber++;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
