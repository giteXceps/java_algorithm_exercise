package methods;

import java.util.Scanner;

public class methodsDemo {
    public static void main(String[] args) {
        sayiBulmaca();
        mesajVer("Exiting..");
    }

    public static void sayiBulmaca() {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

        System.out.println("Which number you want to find?");
        int n = input.nextInt();

        for (int number : numbers) {
            if (number == n) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
