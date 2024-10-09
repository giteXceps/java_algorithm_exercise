import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        
        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara");
        
        System.out.println(numbers.size());
        System.out.println(numbers.get(2));

        numbers.set(2, 100);
        System.out.println(numbers.get(2));

        //numbers.remove(0);
        //numbers.clear();
        //System.out.println(numbers.get(1));

        for (Object obj: numbers){
            System.out.println(obj);
        }
    }
}
