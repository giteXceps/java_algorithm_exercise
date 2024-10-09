public class App {
    public static void main(String[] args) throws Exception {
        KronometreThread thread1 = new KronometreThread("Kronometre1");
        KronometreThread thread2 = new KronometreThread("Kronometre2");
        KronometreThread thread3 = new KronometreThread("Kronometre3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
