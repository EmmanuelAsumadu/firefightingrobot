double size= 40
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins
import eu.mihosoft.vrl.v3d.Transform

import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere 
CSG vitamin_capScrew_M3 = Vitamins.get("capScrew", "M3")
CSG vitamin_heatedThreadedInsert_M3_pressIn = Vitamins.get("heatedThreadedInsert", "M3-pressIn")
double heightOfChamber = 4*25.4 //now in inches 
double radiusOfChamber = 8.25*25.4/2 //now in inches 
double innerRadius = 7.17*25.4/2
double largePlateRadius = 8.25*25.4/2
double smallPlateRadius = 3*25.4/2
double LargePlateHieght = 6.35
double smallPlateHieght = LargePlateHieght
double boltradius = 1.5 
double boltHeight = heightOfChamber+LargePlateHieght
double locationOfBolt = ((radiusOfChamber-innerRadius)/2)+innerRadius

CSG vitamin_heatedThreadedInsert_M5 = Vitamins.get("heatedThreadedInsert", "M5").toZMax()

CSG vitamin_ballBearing_695zz = Vitamins.get("ballBearing", "695zz") 
CSG vitamin_capScrew_M5x25 = Vitamins.get("capScrew", "M5x25")
CSG spaceOfCap =vitamin_heatedThreadedInsert_M5.union(vitamin_capScrew_M5x25).roty(-90).movez(size*1.0/2.0).movex(size*2.8)
CSG secondSpaceCap =spaceOfCap.mirrorx()


CSG bolt = new Cylinder(boltradius,boltHeight).toCSG()
					.movex(locationOfBolt)


CSG setOfBolts = bolt
double numBolts =8
for( int i =0; i<numBolts;i++) {
	double angle = i*(360/numBolts);
	CSG tmpBolt = bolt.rotz(angle)
	setOfBolts=setOfBolts.union(tmpBolt)
}					
CSG simpleSyntax = new Cylinder (radiusOfChamber,heightOfChamber,(int)100).toCSG()
CSG smallCylinder = new Cylinder (innerRadius,heightOfChamber,(int)100).toCSG()
CSG finalCylinder = simpleSyntax.difference(smallCylinder);
CSG smallPlate  = new Cylinder(smallPlateRadius,smallPlateHieght,(int)100).toCSG()
CSG LargePlate = new Cylinder (largePlateRadius,LargePlateHieght,(int)100).toCSG()
CSG finalPlate = LargePlate
					.difference(smallPlate)
					.movez(heightOfChamber)
					.difference(setOfBolts)
					
					
CSG HOLE =  finalCylinder.difference(setOfBolts);
finalPlate.addExportFormat("svg")
finalPlate.setManufacturing({toMfg->
	return toMfg.toZMin()	
})
return [finalPlate,HOLE,vitamin_heatedThreadedInsert_M3_pressIn,vitamin_ballBearing_695zz,vitamin_capScrew_M5x25,spaceOfCap,secondSpaceCap]






