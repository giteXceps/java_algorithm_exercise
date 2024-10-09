package classesWithAttribute;

public class ProductManager {
    public void Add(Product product) {
        //JDCB
        System.out.println("Product Added! " + product.getName());
    }

    public void Add2(int id, String name, String discription, int stockAmount, double price){
        // fail code!!!!! do not use like that
    }
}