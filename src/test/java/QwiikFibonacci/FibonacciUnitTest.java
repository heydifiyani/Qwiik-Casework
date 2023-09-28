package QwiikFibonacci;
import org.junit.jupiter.api.Test;


public class FibonacciUnitTest {
    @Test
    void testGenerateFibonacci() {
        int n = 10;
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};

        int[] result = FibonacciIterative.generateFibonacci(n);

    }
}
