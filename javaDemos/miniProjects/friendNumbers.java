package miniProjects;

import java.util.Scanner;

// 220-284
public class friendNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input 2 numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int sum1=0, sum2=0;

        for(int i=1;i<x;i++){
            if(x%i==0){
                sum1+=i;
            }
        }

        for(int i=1;i<x;i++){
            if(y%i==0){
                sum2+=i;
            }
        }
        
        if(x==sum2 || y==sum1){
            System.out.println("These are friend!");
        } else{
            System.out.println("These are not friend!");
        }
    }
}
