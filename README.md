This project is on hold for the duration of the fall semester (until december 2025).

This is an unfinished prototype of a raytracer made 100% in Java. 
The output file is image.png
you can change the 3D projection mode in the Driver class by changing :
projection = new Perspective(new Point3D(-200.0,200.0,600), new Point3D(0.0,0.0,0.0),30);
to
projection = new Orthographic();

Perspective projection is what's used for realistic results but orthographic projection is faster.

There is not lighting system yet which is why it's unfinished.
