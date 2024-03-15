import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("Sivas");
        sehirler.add("Istanbul");
        sehirler.add("Aydin");

        sehirler.remove("Istanbul");
        Collections.sort(sehirler);

        for(String sehir: sehirler){
            System.out.println(sehir);
        }
    }
}
