package interfaces;

public class Main {

    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        // customerManager.customerDal = new SqlServerCustomerDal(); // if you use first way you need this line
        customerManager.Add();
    }
}
