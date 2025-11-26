import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(15.0, Calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, Calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50.0, Calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, Calculator.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}