package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle Branch Coverage test suite.
 */
public class TriangleBranchTest {

    @Test
    public void mutation4(){
        Type actual = Triangle.classify(-1, 2, 2); 
        Type expected = INVALID;
        assertEquals(actual, expected);

    }

    @Test
    public void mutation7_8(){
        Type actual = Triangle.classify(3, 2, 0); 
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation9(){
        Type actual = Triangle.classify(3, -1, 3); 
        Type expected = INVALID;
        assertEquals(actual, expected);

    }

    // a + c <= b
    @Test
    public void mutation10(){
        Type actual = Triangle.classify(3, 4, 1); 
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    // b + c <= a
    @Test
    public void mutation11(){
        Type actual = Triangle.classify(6, 3, 2); 
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void test14(){
        Type actual = Triangle.classify(5, 12, 5); 
        Type expected = INVALID;
        assertEquals(actual, expected);

    }

    @Test
    public void test15(){
        Type actual = Triangle.classify(15, 7, 7); 
        Type expected = INVALID;
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

    @Test
    public void testEquilateralTriangle() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    // a == b, a + b <= c
    @Test
    public void testDefaultTriangle(){
        Type actual = Triangle.classify(1, 1, 2);
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

    // a + b <= c
    @Test
    public void testNotATriangle(){
        Type actual = Triangle.classify(1, 2, 3);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
}
