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

    @Test
    void calculateAreaMixed() {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 5);
        shapes[1] = new Circle(5);
        assertEquals( 25 + 25 * Math.PI, AreaCalculator.calculateArea(shapes), 0);
    }
}