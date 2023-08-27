package E811;

import java.awt.geom.Ellipse2D;

public class GeometryRunner {
    public static void main(String[] args) {
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,30,40) ;

        System.out.println("An ellipse with a = " + ellipse.getHeight() / 2.0);
        System.out.println("An ellipse with b = " + ellipse.getWidth() / 2.0);
        System.out.println("Perimeter :" + Geometry.perimeter(ellipse));
        System.out.println("Area :" + Geometry.area(ellipse));
    }
}
