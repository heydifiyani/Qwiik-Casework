package QwiikTriangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleUnitTest {
    @Test
    void testEquilateral() {
        String result = TriangleTest.classifyTriangle(5, 5, 5);
        assertEquals("Equilateral", result);
    }

    @Test
    void testIsosceles() {
        String result = TriangleTest.classifyTriangle(3, 3, 4);
        assertEquals("Isosceles", result);
    }

    @Test
    void testScalene() {
        String result = TriangleTest.classifyTriangle(3, 4, 5);
        assertEquals("Scalene", result);
    }
}
