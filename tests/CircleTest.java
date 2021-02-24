import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void setRadius() {
        circle.setRadius(20);
        assertEquals(20, circle.getRadius());
    }

    @Test
    void setRadiusInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                circle.setRadius(0));
    }

    @Test
    void testToString() {
        assertEquals("Circle with radius 10.0",circle.toString());
    }

    @Test
    void testGetArea() {
        assertEquals(314.2,circle.getArea(), 0.05);
    }
}