package arraysDemo;

public class arraysDemo {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);
        
        System.out.println("\n----------------\n");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        // ogrenciler[4]="Ali"; failed code example

        for (int i = 0; i < 4; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("\n----------------\n");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}
