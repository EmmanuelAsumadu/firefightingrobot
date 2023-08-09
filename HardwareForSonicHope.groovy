import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.RoundedCube
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
double firstHeight = 70.3
double firstRadius = 28.2
double lilRad= 12.7
double lilHeight= firstHeight
double lilCubeX = 64
double lilCubeY= 80
double lilCubeZ = 60
double miniCubeX = lilCubeX/3
double miniCubeY = lilCubeY/3
double miniCubeZ= lilCubeZ
double CubeX =40
double CubeY= 15
double CubeZ = lilCubeZ
//miniCube is the space for the servo motor 
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
CSG Joint1 = new Cylinder(firstRadius,firstHeight).toCSG().movey(300).movez(72)
CSG roundedcube =new RoundedCube(lilCubeX,lilCubeY,lilCubeZ).cornerRadius(4).toCSG().movey(300).movez(40)
CSG SmallCube = new Cube (miniCubeX,miniCubeY,miniCubeZ).toCSG().movey(300).movez(40)
CSG finalCube = roundedcube.difference(SmallCube);
CSG smallRoundedCube = new RoundedCube(CubeX,CubeY,CubeZ).cornerRadius(4).toCSG().movey(330).movez(150)
finalShape.addAssemblyStep(1, new Transform().movex(100))
Joint1.addAssemblyStep(1,new Transform().movez(100))
finalCube.addAssemblyStep(1,new Transform().movey(100))
return [finalShape,plate,finalCube,Joint1,smallRoundedCube]