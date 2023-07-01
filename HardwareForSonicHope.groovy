import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

double cubeDimX = 210
double cubeDimY = 210
double cubeDimZ = 105
double bigSphereNum = 105
double smallSphereNum = 95
double radiusOfCylinder = 70
double heightOfCylinder = 120


// code here
CSG bigSphere = new Sphere(bigSphereNum, 140, 140)
				  .toCSG()
CSG bigCube = new Cube(cubeDimX, cubeDimY, cubeDimZ)
				  .toCSG()
				  .movez(55)
CSG semi = bigSphere.difference(bigCube);
CSG smallSphere = new Sphere(smallSphereNum,130,135)
					 .toCSG()
CSG smallSemi = smallSphere.difference(bigCube);
CSG finalSemi = semi.difference(smallSemi).movez(100);
CSG cylinder = new Cylinder(radiusOfCylinder,heightOfCylinder).toCSG().movez(-20)
CSG finalShape = finalSemi.difference(cylinder).roty(180);
return [finalShape.movez(100)]
