package by.bsuir.shamukov.random;

import org.junit.Test;
import static org.junit.Assert.*;


public class RandomTest {
    /**
     * Проверяет действительно ли a и b входят в диапазон [a, b]
     */
    @Test
    public void testGetRandomNumber() {
        int [] a = {10, 20, 30, -40};
        int [] b = {20, 100, 10000, 0};
        for(int i = 0; i < a.length; i++){
            System.out.println("getRandomNumber(" + a[i] + ", " + b[i] + ")");
            int result = Random.getRandomNumber(a[i], b[i]);
            System.out.println("res = " + result);
            assertTrue("a и b не входят в диапазон [a, b]", result >= a[i] && result <= b[i]);
        }
    }
}
