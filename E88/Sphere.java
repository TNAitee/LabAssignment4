package E88;

public class Sphere {
    private double radius ;

    public Sphere( double radius){
        this.radius = radius;
    }

    public double getSphereVolume(){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }

    public double getSphereSurfaceArea(){
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius,2) ;
        return surfaceArea;
    }
}
