package miniProjects;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int x = input.nextInt();
        boolean isPrime = true;

        if (x < 1) {
            System.out.println("Negative numbers cannot be prime!");
            return;
        }

        if (x == 1) {
            System.out.println("Number is not prime!");
            return;
        }

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime!");
        } else {
            System.out.println("Number is not prime!");
        }
    }
}
