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
double radiusOfCylinder=  68
double heightOfCylinder = 120
double plateHeight = 20 
double firstHeight = 206.4
double firstRadius = 28.2
double lilRad= 12.7
double lilHeight= firstHeight
double lilCubeX = 64
double lilCubeY= 80
double lilCubeZ = 60

// code here
CSG bigSphere = new Sphere(bigSphereNum,30,30)
				  .toCSG()
CSG bigCube = new Cube(cubeDimX, cubeDimY, cubeDimZ)
				  .toCSG()
				  .movez(55)
CSG semi = bigSphere.difference(bigCube);
CSG smallSphere = new Sphere(smallSphereNum)
					 .toCSG()
CSG smallSemi = smallSphere.difference(bigCube);
CSG finalSemi = semi.difference(smallSemi);
CSG cylinder = new Cylinder(radiusOfCylinder,heightOfCylinder,(int)40).toCSG()
CSG finalShape = finalSemi.roty(180).difference(cylinder);
CSG plate = new Cylinder(radiusOfCylinder,plateHeight).toCSG()
							.movey(300)
CSG firstCylinder = new Cylinder (firstRadius,firstHeight,(int)30).toCSG()
CSG lilCylinder = new Cylinder (lilRad,lilHeight).toCSG()
CSG CylinderWithHole = firstCylinder.difference(lilCylinder);
CSG rectangle =new Cube(lilCubeX,lilCubeY,lilCubeZ).toCSG().movez(190).movey(240);
						
CSG Cylinder_Hole_Rectangle = CylinderWithHole.difference(rectangle).movey(300)
finalShape.addAssemblyStep(1, new Transform().movex(100))
return [finalShape,plate,Cylinder_Hole_Rectangle,rectangle]