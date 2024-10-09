public class RegisteredCustomer extends BaseCustomer {
    private int age;
    private String email;
    private int customerNumber;


    public RegisteredCustomer(String name, String lastName, int age, String email){
        super(name, lastName);
        this.age=age;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerNumber() {
        customerNumber = this.age * 21;
        return customerNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
