package Jan12.calc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Before
    public void setup() {
        calculator = new Calculator();
    }
    @Test
    public void addAndTestEquals() {
        int sum = calculator.add(5,7);
        assertEquals(12, sum);
        calculator = null;
    }
}
