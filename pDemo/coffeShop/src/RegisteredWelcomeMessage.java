public class RegisteredWelcomeMessage extends BaseWelcomeMessage{

    private RegisteredCustomer registeredCustomer;

    @Override
    public void welcomeMessage(BaseCustomer baseCustomer){
        this.registeredCustomer = (RegisteredCustomer) baseCustomer;
        System.out.println("Dear, " + registeredCustomer.getName() + "\nWelcome Back!\n");
    }
}
