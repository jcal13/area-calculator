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
        Object[] objects = new Object[2];
        objects[0] = new Rectangle(5, 5);
        objects[1] = new Circle(5);
        assertEquals( 25 + 25 * Math.PI, AreaCalculator.calculateArea(objects), 0);
    }
}