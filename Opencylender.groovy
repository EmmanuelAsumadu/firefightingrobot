import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere 

CSG vitamin_capScrew_M3 = Vitamins.get("capScrew", "M3")
CSG vitamin_heatedThreadedInsert_M3_pressIn = Vitamins.get("heatedThreadedInsert", "M3-pressIn")
double heightOfChamber = 7*25.4
double diameterOfChamber = 8.25*25.4
CSG simpleSyntax = new Cylinder (diameterOfChamber,heightOfChamber) .toCSG()
						  
//Your code here



