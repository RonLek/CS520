package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle Line Coverage test suite.
 */
public class TriangleLineTest {

    @Test
    public void testEquilateralTriangle() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    // evaluates constructor
    @Test
    public void testEvaluateConstructor(){
        Triangle tri = new Triangle();
        assertNotNull(tri);
    }

    // a < 0, b < 0, c < 0
    @Test
    public void testNegativeValues(){
        Type actual = Triangle.classify(-1, -3, -5); 
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    // a + b <= c
    @Test
    public void testNotATriangle(){
        Type actual = Triangle.classify(1, 2, 3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    // a != b, b != c, a != c
    @Test
    public void testScaleneTriangle(){
        Type actual = Triangle.classify(3, 4, 5);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    // a == b, b != c, a != c
    @Test
    public void testIsoscelesTriangle1(){
        Type actual = Triangle.classify(3, 3, 5);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    // a != b, b == c, a != c
    @Test
    public void testIsoscelesTriangle2(){
        Type actual = Triangle.classify(3, 5, 3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    // a != b, b != c, a == c
    @Test
    public void testIsoscelesTriangle3(){
        Type actual = Triangle.classify(5, 3, 3);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    // a == b, a + b <= c
    @Test
    public void testDefaultTriangle(){
        Type actual = Triangle.classify(1, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
}
