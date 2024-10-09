package multiDimensionalArrayDemo;

public class multiDimensionalArrayDemo {
    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Sivas";
        sehirler[2][0] = "Malatya";
        sehirler[2][1] = "Diyarbakir";
        sehirler[2][2] = "Sanliurfa";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sehirler[i][j]);
            }
            System.out.println("--------------------");
        }
    }
}
