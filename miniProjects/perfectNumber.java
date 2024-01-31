package miniProjects;

import java.util.Scanner;

// 6 --> 1+2+3=6
public class perfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int x = input.nextInt();
        int sum = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }

        if (sum == x) {
            System.out.println("Number is perfect!");
        } else {
            System.out.println("Number is not perfect!");
        }
    }
}
