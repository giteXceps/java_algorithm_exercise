package miniProjects;

import java.util.Scanner;

public class findNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] sayilar = new int[]{1,2,5,7,9,0};

        System.out.println("Which number you want to find?");
        int aranacak = input.nextInt();

        for(int number:sayilar){
            if(number==aranacak){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
