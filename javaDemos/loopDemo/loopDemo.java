package loopDemo;

public class loopDemo {
    public static void main(String[] args) {
        //for loop
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For loop end!");

        //while loop
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While loop end!");
        
        //do-while loop
        int j=0;
        do{
            System.out.println(j);
            j ++ ;
        } while(j<10);
        System.out.println("Do-While loop end!");
    }
}
