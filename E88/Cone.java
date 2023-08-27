package E88;

public class Cone {
    private static double radius , height ;

    public Cone( double radius , double height ){

        this.radius = radius;
        this.height = height;
    }

    public double getConeVolume(){
        double volume =  Math.PI * Math.pow(radius,2) * (height / 3);
        return volume;
    }

    public double getConeSurfaceArea(){
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return surfaceArea;
    }
}
