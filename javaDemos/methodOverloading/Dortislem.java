package methodOverloading;

public class Dortislem {
    public int topla(int num1, int num2) {
        return num1 + num2;
    }

    public int topla(int num1, int num2, int num3) { //overloaded method
        return num1 + num2 + num3;
    }
}
