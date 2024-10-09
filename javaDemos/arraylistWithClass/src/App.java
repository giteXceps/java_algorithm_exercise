import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer(1, "Sefa", "Metin"));
        customers.add(new Customer(2, "Nilay", "Aygel"));
        customers.add(new Customer(3, "Safa", "Metin"));

        customers.remove(0);

        for (Customer customer : customers) {
            System.out.println(customer.firstName);
        }
    }
}
