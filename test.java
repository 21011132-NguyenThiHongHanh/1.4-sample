import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    void testEquilateralTriangle() {
        assertTrue(TriangleClassifier.isTriangle(3, 3, 3));
        assertEquals("tam giác đều", TriangleClassifier.classifyTriangle(3, 3, 3));
    }

    @Test
    void testIsoscelesTriangle() {
        assertTrue(TriangleClassifier.isTriangle(5, 5, 7));
        assertEquals("tam giác cân", TriangleClassifier.classifyTriangle(5, 5, 7));
    }

    @Test
    void testScaleneTriangle() {
        assertTrue(TriangleClassifier.isTriangle(3, 4, 5));
        assertEquals("tam giác thường", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    void testNotATriangle() {
        assertFalse(TriangleClassifier.isTriangle(1, 2, 10));
    }
}
