package guru.elevatehub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for Calculator. These run in the pipeline's Test stage
 * via `mvn test`, the same way they run on your own machine.
 */
class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(6, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }

    @Test
    void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(0, 5));
    }
}