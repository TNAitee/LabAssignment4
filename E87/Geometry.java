package E87;

public class Geometry {
    private static double radius , height ;

    public Geometry( double radius , double height ){

        this.radius = radius;
        this.height = height;
    }

    public Geometry( double height){
        this.height = height;
    }

    //cone
    public static double coneVolume(){
        double volume =  Math.PI * Math.pow(radius,2) * (height / 3);
        return volume;
    }

    public static double coneSurfaceArea(){
        double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return surfaceArea;
    }

    //cube
    public static double cubeVolume(){
        double volume = Math.pow(height,2);
        return volume;
    }

    public static double cubeSurfaceArea(){
        double surfaceArea = 6 * Math.pow(height, 2);
        return surfaceArea;
    }

    //cylinder
    public static double cylinderVolume(){
        double volume = Math.PI * Math.pow(radius,2) * height;
        return volume;
    }

    public static double cylinderSurfaceArea(){
        double surfaceArea = ( 2 * Math.PI * radius * ( height + radius ));
        return surfaceArea;
    }


    //sphere
    public static double sphereVolume(){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }

    public static double sphereSurfaceArea(){
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius,2) ;
        return surfaceArea;
    }
}
