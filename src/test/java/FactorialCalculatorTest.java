import org.example.FactorialCalculator;
import org.example.TextUtility;
import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class FactorialCalculatorTest {


    @Test
    public void FactorialTestNegative(){
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        assertThrows(IllegalArgumentException.class, () -> {
            factorialCalculator.calculateFactorial(-10);
        });

    }

    // tries if the test can do a certain factorials in a certain time
    @Test
    public void testTimeoutFactorialCalculator(){
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        assertTimeout(Duration.ofMillis(1), () -> {
            factorialCalculator.calculateFactorial(100);
        });
    }
}
