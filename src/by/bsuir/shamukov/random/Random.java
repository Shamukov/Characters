package by.bsuir.shamukov.random;

/**
 *
 * @author Шамуков
 */

public class Random {
    public static int getRandomNumber(int a, int b){
        return (int) (Math.random()*(b-a) + a);
    }
}
