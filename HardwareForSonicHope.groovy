import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere
import eu.mihosoft.vrl.v3d.Transform

double cubeDimX = 210
double cubeDimY = 210
double cubeDimZ = 105
double bigSphereNum = 105
double smallSphereNum = 95
double radiusOfCylinder =228 
double heightOfCylinder = 120
double plateHeight = 20 
double firstHeight = 406.4
double firstRadius = 58.2
double lilRad= 12.7
double lilHeight= firstHeight-2 
double lilCubeX = 225
double lilCubeY= 100
double lilCubeZ = 60

// code here
CSG bigSphere = new Sphere(bigSphereNum)
				  .toCSG()
CSG bigCube = new Cube(cubeDimX, cubeDimY, cubeDimZ)
				  .toCSG()
				  .movez(55)
CSG semi = bigSphere.difference(bigCube);
CSG smallSphere = new Sphere(smallSphereNum)
					 .toCSG()
CSG smallSemi = smallSphere.difference(bigCube);
CSG finalSemi = semi.difference(smallSemi);
CSG cylinder = new Cylinder(radiusOfCylinder,heightOfCylinder,(int)100).toCSG()
CSG finalShape = finalSemi.difference(cylinder).roty(180);
CSG plate = new Cylinder(radiusOfCylinder,plateHeight).toCSG()
							.movey(300)
CSG firstCylinder = new Cylinder (firstRadius,firstHeight).toCSG()
CSG lilCylinder = new Cylinder (lilRad,lilHeight).toCSG()
CSG CylinderWithHole = firstCylinder.difference(lilCylinder);
CSG rectangle =new Cube(lilCubeX,lilCubeY,lilCubeZ).toCSG()
						.movez(20)
						.movey(40)
						.movex(30)
CSG Cylinder_Hole_Rectangle = CylinderWithHole.difference(rectangle).movey(300).roty(180).movez(406.4);

finalShape.addAssemblyStep(1, new Transform().movex(100))
return [finalShape,plate,Cylinder_Hole_Rectangle]