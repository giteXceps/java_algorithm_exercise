package methods;

public class methodsDemo2 {
    public static void main(String[] args){
        String message = "Today weather is so good!";
        String newMessage = message.substring(0,2);
        System.out.println(newMessage);
        int sayi = topla(5,7);
        System.out.println(sayi);
        String city = sehirVer();
        System.out.println(city);

        int sum = topla2( 2,3,5,4,6,10);
        System.out.println(sum);
    }

    public static void ekle() {
        System.out.println("Added");
    }

    public static void sil() {
        System.out.println("Deleted");
    }

    public static void guncelle() {
        System.out.println("Updated");
    }

    public static int topla(int x, int y) {
        int  sum=x+y;
        return sum;
    }

    public static int topla2(int... sayilar) {
        int sum = 0;
        for (int sayi:sayilar){
            sum+=sayi;
        }
        return sum;
    }

    public static String sehirVer(){    
        String city = "Ankara";
        return city;
    }
}
