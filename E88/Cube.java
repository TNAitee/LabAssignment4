package E88;

public class Cube {
    private double height ;

    public Cube( double height ){

        this.height = height;
    }

    public double getCubeVolume(){
        double volume = Math.PI * Math.pow(height,3);
        return volume;
    }

    public double getCubeSurfaceArea(){
        double surfaceArea = 6 * Math.pow(height, 2);
        return surfaceArea;
    }
}
