import java.util.Scanner;
import matematik.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(4, 5);

        Logaritma logaritma = new Logaritma();
        logaritma.logHesapla();
    }
}
