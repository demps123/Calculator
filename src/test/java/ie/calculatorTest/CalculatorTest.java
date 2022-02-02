package ie.calculatorTest;

import ie.gmit.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testSubtract()
    {
        assertEquals(7, calc.subtract(17, 10));
    }
}
