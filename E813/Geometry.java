package E813;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class Geometry {
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e)
    {
        double pointX = p.getX();
        double pointY = p.getY();

        double centerX = e.getX();
        double centerY = e.getY();
        double radiusX = e.getCenterX() - e.getX();
        double radiusY = e.getCenterY() - e.getY();
        double a = Math.pow(radiusX, 2);
        double b = Math.pow(radiusY, 2);

        double eq1 = Math.pow(pointX - centerX, 2);

        double eq3 = Math.pow(pointY - centerY, 2);

        if((eq1 / a) + (eq3 / b) < 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isOnBoundary(Point2D.Double p, Ellipse2D.Double e)
    {
        double pointX = p.getX();
        double pointY = p.getY();

        double centerX = e.getX();
        double centerY = e.getY();
        double radiusX = e.getCenterX() - e.getX();
        double radiusY = e.getCenterY() - e.getY();
        double a = Math.pow(radiusX, 2);
        double b = Math.pow(radiusY, 2);

        double eq1 = Math.pow(pointX - centerX, 2);

        double eq3 = Math.pow(pointY - centerY, 2);

        if((eq1 / a) + (eq3 / b) == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
