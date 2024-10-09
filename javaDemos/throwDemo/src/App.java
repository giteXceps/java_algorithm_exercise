public class App {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        System.out.println("Your Balance: " + accountManager.getBalance());
        accountManager.deposit(100);
        System.out.println("Your Balance: " + accountManager.getBalance());

        try{
            accountManager.withdraw(90);
        } catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Your Balance: " + accountManager.getBalance());

        try{
            accountManager.withdraw(20);
        } catch(BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Your Balance: " + accountManager.getBalance());
    }
}
