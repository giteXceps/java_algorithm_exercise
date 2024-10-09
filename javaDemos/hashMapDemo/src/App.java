import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");

        System.out.println(sozluk.size());

        for(String item : sozluk.keySet()){
            System.out.println("Eleman-" + item + ", Deger-" + sozluk.get(item));
        }

        sozluk.remove("table");
        sozluk.clear();

        System.out.println(sozluk.get("table"));
    }
}
