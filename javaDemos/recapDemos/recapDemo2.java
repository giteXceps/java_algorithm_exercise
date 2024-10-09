package recapDemos;

//
public class recapDemo2 {
    public static void main(String[] args) {
        double[] myList = { 1.2, 1.3, 4.3, 5.6 };

        // printing list
        for (double number : myList) {
            System.out.println(number);
        }

        // total value of numbers in the list
        double total = 0;
        for (double number : myList) {
            total += number;
        }
        System.out.println("Sum of numbers in the list = " + total);

        // max value of numbers in the list
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Max value in the list = " + max);
    }
}
