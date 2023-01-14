import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

//Your code here

CSG sphere = new Sphere(25)// Spheres radius
				.toCSG()// convert to CSG to display
CSG simpleSyntax =new Cylinder(10,40).toCSG() // a one line Cylinder

CSG newtihing = sphere.difference(simpleSyntax)


return [newtihing]
