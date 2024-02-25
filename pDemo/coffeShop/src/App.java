public class App {
    public static void main(String[] args) throws Exception {
        RegisteredCustomer registeredCustomer = new RegisteredCustomer();
        registeredCustomer.setName("Sefa");
        RegisteredWelcomeMessage registeredWelcomeMessage = new RegisteredWelcomeMessage();
        registeredWelcomeMessage.welcomeMessage(registeredCustomer);
        
        BaseCustomer baseCustomer = new BaseCustomer();
        baseCustomer.setName("Enes");

        CustomerWelcomeMessage customerWelcomeMessage = new CustomerWelcomeMessage();
        customerWelcomeMessage.welcomeMessage(baseCustomer);
        
    }
}
