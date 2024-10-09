import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\Users\\Sefa\\Desktop\\java_demos\\files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("Already created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\Users\\Sefa\\Desktop\\java_demos\\files\\students.txt");
        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Can write?: " + file.canWrite());
            System.out.println("Can read?: " + file.canRead());
            System.out.println("File length (byte): " + file.length());
        }
    }

    public static void readFile() {
        File file = new File("C:\\Users\\Sefa\\Desktop\\java_demos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Sefa\\Desktop\\java_demos\\files\\students.txt", true));
            writer.newLine();
            writer.write("Nilay");
            System.out.println("Writed to folder");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
