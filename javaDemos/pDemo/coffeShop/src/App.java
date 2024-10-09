public class App {
    public static void main(String[] args) throws Exception {
        RegisteredCustomer registeredCustomer = new RegisteredCustomer("REG0Sefa", "REG0Metin", 15, "REG0sefametin68@gmail.com");
        RegisteredWelcomeMessage registeredWelcomeMessage = new RegisteredWelcomeMessage();
        registeredWelcomeMessage.welcomeMessage(registeredCustomer);
        
        BaseCustomer baseCustomer = new BaseCustomer("Sefa", "Metin");

        CustomerWelcomeMessage customerWelcomeMessage = new CustomerWelcomeMessage();
        customerWelcomeMessage.welcomeMessage(baseCustomer);

        System.out.println(registeredCustomer.getCustomerNumber());
        
        RegisteredCustomer registeredCustomer2 = new RegisteredCustomer("REG1Sefa", "REG1Metin", 15, "REG1sefametin68@gmail.com");
        System.out.println(registeredCustomer2.lastName);
    }
}
