package recapDemos;
// which one is maximum?

public class reCapDemo1 {
    public static void main(String[] args){
        int sayi1=32;
        int sayi2=25;
        int sayi3=29;

        int max=sayi1;

        if (sayi2>max){
            max=sayi2;
        }
        if (sayi3>max){
            max=sayi3;
        }

        System.out.println("Maximim sayi= " + max);

    }
}
