public class CheckingAccount extends BankAccount {
    public static final double FEE = 0.15; // 15 cents

    // Create constructor
    public CheckingAccount(String name, double initialAmount) {
        super(name, initialAmount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override withdraw method
    @Override
    public boolean withdraw(double amount) {
        // Add fee for check clearing
        amount += FEE;
        // Call withdraw method from superclass
        return super.withdraw(amount);
    }
}
