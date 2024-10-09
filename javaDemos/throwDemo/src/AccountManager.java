public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println(">>Deposited " + amount);
    }

    public void withdraw(double amount) throws BalanceInsufficentException{
        if (balance >= amount) {
            balance -= amount;
            System.out.println(">>Withdrawed " + amount);
        } else {
            throw new BalanceInsufficentException("You do not have enough balance");
        }
    }

    public double getBalance() {
        return balance;
    }

}
