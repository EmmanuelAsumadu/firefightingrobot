import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

//Your code here
double Height_of_chamber = 140 
double wallthickness = 5
double spheresapce= 73.8/2
CSG chamber_core =new Cylinder(spheresapce*2-wallthickness,Height_of_chamber-wallthickness*2).toCSG() // a one line Cylinder
.movez(wallthickness)
CSG banana  = new Cylinder(spheresapce*2.7,140)// Spheres radius
				.toCSG()// convert to CSG to display
CSG simpleSyntax =new Cylinder(spheresapce,150).toCSG() // a one line Cylinder

CSG newtihing = banana.difference(simpleSyntax)
.difference(chamber_core)

return [newtihing]
