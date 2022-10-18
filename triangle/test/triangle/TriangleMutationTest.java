package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle Line Coverage test suite.
 */

// undetectable mutants: 59, [63, 70, 81](a + b > a * b only for negative), 101, 111, 128, 136, 145
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

    // @Test
    // public void mutation11() {
    //     Type actual = Triangle.classify(3, 0, 3);
    //     Type expected = INVALID;
    //     assertEquals(actual, expected);
    // }

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
}
