package scene;

import geometry.GeometricObject;
import geometry.Plane;
import geometry.Sphere;
import utility.Color;
import utility.Normal;
import utility.Point3D;

import java.util.ArrayList;

public class World {
    public ViewPlane viewPlane;
    public ArrayList<GeometricObject> objects;
    public Color background;

    public World( int width, int height, double size) {

        viewPlane = new ViewPlane(width, height, size);
        background = new Color(0,0,0);

        objects = new ArrayList<GeometricObject>();
        objects.add(new Sphere(new Point3D(150.0,300,0.0), 50, new Color(1,0,0)));
        objects.add(new Sphere(new Point3D(0.0,50,0.0), 50, new Color(0,1,0)));
        objects.add(new Sphere(new Point3D(-150.0,-50,0.0), 50, new Color(0,0,1)));
        objects.add(new Plane(new Point3D(0,0.0,0.0), new Normal(0.0,1.0,0.2), new Color(0,1,1)));
    }
}
