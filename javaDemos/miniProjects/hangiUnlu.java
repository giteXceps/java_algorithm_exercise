package miniProjects;

import java.util.Scanner;

public class hangiUnlu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Karakter giriniz");
        char harf = input.next().charAt(0);

        switch (harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'u':
            case 'U':
                System.out.println("Karakter kalin unludur");
                break;

            case 'e':
            case 'E':
            case 'i':
            case 'İ':
            case 'ö':
            case 'Ö':
            case 'ü':
            case 'Ü':
                System.out.println("Karakter ince unludur");
                break;

            default:
                System.out.println("Karakter unlu degildir");
        }

    }
}
