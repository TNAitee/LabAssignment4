package E813;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isInside() {
        Point2D.Double p1 = new Point2D.Double(-10,0);
        Point2D.Double p2 = new Point2D.Double(-5,-6);
        Point2D.Double p3 = new Point2D.Double(8,6);

        Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 20, 16);

        boolean onBoundary = Geometry.isInside(p1, e);
        assertFalse(onBoundary);
        boolean inside = Geometry.isInside(p2, e);
        assertTrue(inside);
        boolean outside = Geometry.isInside(p3, e);
        assertFalse(outside);
    }

    @Test
    void isOnBoundary() {
        Point2D.Double p1 = new Point2D.Double(-10,0);
        Point2D.Double p2 = new Point2D.Double(-5,-6);
        Point2D.Double p3 = new Point2D.Double(8,6);

        Ellipse2D.Double e = new Ellipse2D.Double(0, 0, 20, 16);

        boolean onBoundary = Geometry.isOnBoundary(p1, e);
        assertTrue(onBoundary);
        boolean inside = Geometry.isOnBoundary(p2, e);
        assertFalse(inside);
        boolean outside = Geometry.isOnBoundary(p3, e);
        assertFalse(outside);
    }
}