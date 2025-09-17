package geometry;

import utility.Color;
import utility.Ray;

public abstract class GeometricObject {
    public abstract double hit(Ray ray);
    public Color color;
}
