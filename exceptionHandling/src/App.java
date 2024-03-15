public class App {
    public static void main(String[] args) throws Exception {

        try {
            int[] sayilar = new int[] { 1, 2, 3 };
            System.out.println(sayilar[5]);
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("Hata!");
        } finally {
            System.out.println("i always run");
        }

    }
}
