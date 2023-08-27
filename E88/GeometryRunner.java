package E88;

import java.util.Scanner;

public class GeometryRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any radius : ");
        double radius = in.nextDouble();

        System.out.println("Enter any height : ");
        double height = in.nextDouble();

        Cone cone = new Cone(radius, height);
        Cube cube = new Cube(height);
        Cylinder cylinder = new Cylinder(radius,height);
        Sphere sphere = new Sphere(radius);

        System.out.println("Volume of the cone :" + cone.getConeVolume());
        System.out.println("Surface area of the cone :" + cone.getConeSurfaceArea());
        System.out.println("Volume of the cube :" + cube.getCubeVolume());
        System.out.println("Surface area of the cube :" + cube.getCubeSurfaceArea());
        System.out.println("Volume of the cylinder :" + cylinder.getCylinderVolume());
        System.out.println("Surface area of the cylinder :" + cylinder.getCylinderSurfaceArea());
        System.out.println("Volume of the sphere :" + sphere.getSphereVolume());
        System.out.println("Surface area of the sphere :" + sphere.getSphereSurfaceArea());



    }

}
