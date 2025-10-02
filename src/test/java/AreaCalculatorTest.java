import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaCalculatorTest {

    @Test
    void calculateArea() {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(5, 5);
        rectangles[1] = new Rectangle(5, 5);
        assertEquals(50, AreaCalculator.calculateArea(rectangles), 0);
    }
}