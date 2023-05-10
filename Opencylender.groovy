double size= 40
import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere 
CSG vitamin_capScrew_M3 = Vitamins.get("capScrew", "M3")
CSG vitamin_heatedThreadedInsert_M3_pressIn = Vitamins.get("heatedThreadedInsert", "M3-pressIn")
double heightOfChamber = 5*25.4 //now in inches 
double radiusOfChamber = 8.25*25.4/2 //now in inches 
double innerRadius = 7*25.4/2
double largePlateRadius = 2.25*25.4/2
double smallPlateRadius = 1.25*25.4/2
double LargePlateHieght = 2*25.4
double smallPlateHieght = 2*25.4

CSG simpleSyntax = new Cylinder (radiusOfChamber,heightOfChamber,(int)100).toCSG()
CSG smallCylinder = new Cylinder (innerRadius,heightOfChamber,(int)100).toCSG()
CSG finalCylinder = simpleSyntax.difference(smallCylinder);
CSG smallPlate  = new Cylinder(smallPlateRadius,smallPlateHieght,(int)100).toCSG()
CSG LargePlate = new Cylinder (largePlateRadius,LargePlateHieght,(int)100).toCSG()
CSG finalPlate = LargePlate.difference(smallPlate);
return [finalCylinder.movex(size*4),finalPlate]

