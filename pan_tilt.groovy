// code here
import com.neuronrobotics.bowlerstudio.vitamins.Vitamins

import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Isosceles
CSG bearing = Vitamins.get("ballBearing", "6810_2RS")
double height;
double width;
int inch = 24.5
CSG base =new Isosceles(60,25,40).toCSG()
CSG motor= Vitamins.get("LewanSoulMotor", "lx_224")

return[base,bearing,motor]