package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle Line Coverage test suite.
 */

// undetectable mutants: 11, 59, 76, 87, 101, 111, 128, 136, 145
public class TriangleMutationTest {

    @Test
    public void mutation2() {
        Type actual = Triangle.classify(0, 1, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation6() {
        Type actual = Triangle.classify(1, 1, 1);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation7() {
        Type actual = Triangle.classify(1, 0, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation16() {
        Type actual = Triangle.classify(1, 1, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    
    @Test
    public void mutation18() {
        Type actual = Triangle.classify(1, 1, -1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation20() {
        Type actual = Triangle.classify(0, 0, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation67() {
        Type actual = Triangle.classify(1, 2, 4);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation74() {
        Type actual = Triangle.classify(1, 4, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation84() {
        Type actual = Triangle.classify(3, 1, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation108() {
        Type actual = Triangle.classify(3, 3, 7);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation126() {
        Type actual = Triangle.classify(2, 4, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation143() {
        Type actual = Triangle.classify(4, 2, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation80() {
        Type actual = Triangle.classify(9, 8, 2);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation63() {
        Type actual = Triangle.classify(100, 50, 150);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation70() {
        Type actual = Triangle.classify(100, 150, 50);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation81() {
        Type actual = Triangle.classify(150, 50, 100);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void mutation87() {
        Type actual = Triangle.classify(-1, -1, 1);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

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
}
