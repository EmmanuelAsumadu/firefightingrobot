import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere 

CSG vitamin_capScrew_M3 = Vitamins.get("capScrew", "M3")
CSG vitamin_heatedThreadedInsert_M3_pressIn = Vitamins.get("heatedThreadedInsert", "M3-pressIn")
double heightOfChamber = 7*25.4/2 //now in inches 
double radiusOfChamber = 8.25*25.4/2 //now in inches 
double innerRadius = 6.25*25.4/2
innerCylinder = new Cylinder (heightOfChamber,innerRadius,(int)100).toCSG()

CSG simpleSyntax = new Cylinder (radiusOfChamber,radiusOfChamber,heightOfChamber,(int)100) .toCSG()
FinalCylinder = simpleSyntax.difference(innerCylinder);
return [innerCylinder.movey(size*3), simpleSyntax.movex(size*4), FinalCylinder]
//Your code here



