package abstractClasses;

public abstract class GameCalculator {

    public abstract void calculate(); // if someone need to use this function need to override

    public final void gameOver() { // we wrote final so noone can't override
        System.out.println("Game Over");
    }

}
