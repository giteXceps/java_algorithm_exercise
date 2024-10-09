import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {
    public static void main(String[] args) /*throws IOException*/{
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Sefa\\Desktop\\java_demos\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Total= " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally{
            try {
                reader.close();
            } catch (Exception exception) {
                
            }
        }
    }
}
