import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

//Your code here
double spheresapce= 73.8/2
CSG sphere = new Sphere(spheresapce*2)// Spheres radius
				.toCSG()// convert to CSG to display
CSG simpleSyntax =new Cylinder(spheresapce,150).toCSG() // a one line Cylinder

CSG newtihing = sphere.difference(simpleSyntax)


return [newtihing]
