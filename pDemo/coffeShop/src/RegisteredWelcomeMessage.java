public class RegisteredWelcomeMessage extends BaseWelcomeMessage{

    private RegisteredCustomer registeredCustomer;

    @Override
    public void welcomeMessage(BaseCustomer baseCustomer){
        this.registeredCustomer = (RegisteredCustomer) baseCustomer;
        System.out.println("Dear, \n" + registeredCustomer.getName() + "\nWelcome Back!");
    }
}
