package interfaces;

public class CustomerManager {

    //ICustomerDal customerDal; // first way

    private ICustomerDal customerDal; // second way this one is better
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void Add(){
        //working codes
        customerDal.Add();
    }
}
