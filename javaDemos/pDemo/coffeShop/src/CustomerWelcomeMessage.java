public class CustomerWelcomeMessage extends BaseWelcomeMessage{
    @Override
    public void welcomeMessage(BaseCustomer baseCustomer){
        System.out.println("Welcome, " + baseCustomer.getName() + "\n");
    }
}
