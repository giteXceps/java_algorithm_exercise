package abstractClasses;

public class Main {
    public static void main(String[] args){

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        KidsGameCalculator kidsGameCalculator = new KidsGameCalculator();
        kidsGameCalculator.calculate();

        // GameCalculator gameCalculator = new GameCalculator(); // abstract classes cant new

        GameCalculator gameCalculator = new WomanGameCalculator(); // can use like this
        gameCalculator.calculate();
    }
}
