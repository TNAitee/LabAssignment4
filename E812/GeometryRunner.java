package E812;

import java.awt.geom.Point2D;

public class GeometryRunner {
    public static void main(String[] args) {
        Point2D.Double p = new Point2D.Double(3,1);
        Point2D.Double q = new Point2D.Double(8,-4);

        System.out.println("Angle :" + Geometry.angle(p,q));
        System.out.println("Slope :" + Geometry.slope(p,q));
    }
}
