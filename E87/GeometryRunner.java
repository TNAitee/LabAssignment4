package E87;


import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any radius : ");
        double radius = in.nextDouble();

        System.out.println("Enter any height : ");
        double height = in.nextDouble();

        Geometry cone = new Geometry(radius, height);
        Geometry cube = new Geometry(height);
        Geometry cylinder = new Geometry(radius,height);
        Geometry sphere = new Geometry(radius);

        System.out.println("Volume of the cone :" + cone.coneVolume());
        System.out.println("Surface area of the cone :" + cone.coneSurfaceArea());
        System.out.println("Volume of the cube :" + cube.cubeVolume());
        System.out.println("Surface area of the cube :" + cube.cubeSurfaceArea());
        System.out.println("Volume of the cylinder :" + cylinder.cylinderVolume());
        System.out.println("Surface area of the cylinder :" + cylinder.cylinderSurfaceArea());
        System.out.println("Volume of the sphere :" + sphere.sphereVolume());
        System.out.println("Surface area of the sphere :" + sphere.sphereSurfaceArea());

    }

}
