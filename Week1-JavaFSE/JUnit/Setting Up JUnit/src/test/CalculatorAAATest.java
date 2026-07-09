import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAAATest {

    @Test
    void testAddition() {

        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(20, 30);

        // Assert
        assertEquals(50, result);

    }

}