public class App {
    public static void main(String[] args) throws Exception {
        //ArrayList<String> sehirler = new ArrayList<String>(); //generic class 
        //sehirler.add("Ankara");
        //sehirler.add("Istanbul");
        //sehirler.add("Izmir");

        //Customer
        //Product
        //Validator

        MyList<String> sehirler = new MyList<String>();
        sehirler.add("Ankara");
        //sehirler.add(1); //getting error because type

        MyList<Customer> customers = new MyList<Customer>();
        customers.add(new Customer());
    }
}
