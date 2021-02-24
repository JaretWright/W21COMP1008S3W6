import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;
    private Rectangle square;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(10, 20);
        square = new Rectangle(20, 20);
    }

    @Test
    void setLength() {
        rectangle.setLength(25);
        int expResult = 25;
        assertEquals(expResult, rectangle.getLength());
    }

    @Test
    void setLengthInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                rectangle.setLength(-1));
    }

    @Test
    void setLengthInvalid2() {
        try{
            rectangle.setLength(0);
            fail("A length of 0 should have triggered an exception");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void setWidth() {
        rectangle.setWidth(98);
        assertEquals(98, rectangle.getWidth());
    }

    @Test
    void setWidthInvalid() {
        assertThrows(IllegalArgumentException.class, ()->
                rectangle.setWidth(-1));
    }

    @Test
    void getPerimeter() {
        //length = 10 and the width = 20
        //10 + 10 + 20 + 20 = 60
        assertEquals(60, rectangle.getPerimeter());
    }

    @Test
    void getPerimeterSquare() {
        //length = 10 and the width = 20
        //20 + 20 + 20 + 20 = 80
        assertEquals(80, square.getPerimeter());
    }

    //This test will validate if a rectangle returns false
    @Test
    void isSquareRectangle() {
        assertEquals(false, rectangle.isSquare());
    }

    //This test will validate if a square returns true
    @Test
    void isSquare() {
        assertEquals(true, square.isSquare());
    }

    @Test
    void constructorWithInvalidLength() {
        assertThrows(IllegalArgumentException.class, ()->
                new Rectangle(-1,20));
    }

    @Test
    void constructorWithInvalidWidth() {
        assertThrows(IllegalArgumentException.class, ()->
                new Rectangle(20,0));
    }


}