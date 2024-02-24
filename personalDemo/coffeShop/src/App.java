public class App {
    public static void main(String[] args) throws Exception {
        RegisteredCustomer registeredCustomer = new RegisteredCustomer();
        BaseWelcomeMessage welcomeMessage = new BaseWelcomeMessage();
        registeredCustomer.setName("Sefa");
        welcomeMessage.welcomemessage(registeredCustomer.getName());
        
    }
}
