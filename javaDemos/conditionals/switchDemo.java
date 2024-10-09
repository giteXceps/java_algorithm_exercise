package conditionals;

public class switchDemo {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {

            case 'A':
                System.out.println("Mukemmel, gectiniz");
                break;

            case 'B':
                System.out.println("Cok guzel, gectiniz");
                break;

            case 'C':
                System.out.println("Iyi, gectiniz");
                break;

            case 'D':
                System.out.println("Fena degil, gectiniz");
                break;

            case 'F':
                System.out.println("Kaldiniz");
                break;

            default:
                System.out.println("Gecersiz not girildi");
                break;
        }
    }
}
