package calculatorJunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(6, result, "Toplama əməliyyatı düzgün işləmir"); // Düzgün müqayisə
    }

    @Test
    void testaddition2() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "xx");
    }

    @Test
    void testaddition3() {

    }
}
