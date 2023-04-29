// code here
double kilopacal= 101.325 //converstion scaler 
double diameterOfTheSpeaker = 7.0*25.4/1000.0 //measured
println "The diameter of the speaker " + diameterOfTheSpeaker  
double atmMin = 14.7/kilopacal// paper 
double atmMax = 75/kilopacal // paper
double radiusOfTheSpeaker = diameterOfTheSpeaker/2 //calc
double heightOfDifferential = (6.0/8.0*25.4)/1000.0 // measured
double volume = Math.PI*radiusOfTheSpeaker*radiusOfTheSpeaker*heightOfDifferential
println "diameter of the speaker is " + diameterOfTheSpeaker
println "the Minimum of atm is " + atmMin+"the Max of atm is " + atmMax
println "radius of the speaker is " + radiusOfTheSpeaker
println "height of differential is " + heightOfDifferential
println "volume is " + volume
double frequency = 45.0
double timePerCycle = 1.0/frequency
println frequency+" cycles per second"
println timePerCycle+" seconds per cycle"
// P*V=nRT
double temp= 273 // standard temperature is always 273k
double pressure=1.00 // standard pressure is always 1.00 atmosphere pressure
println "pressure " + pressure
println "temp " + temp
double guessCanHieght =7*25.4/1000.0
double volumeOfCan= Math.PI*radiusOfTheSpeaker*radiusOfTheSpeaker*guessCanHieght
double moleOfGass = 22.4*2 // this is liters
double numOfMoleculesPermol = 6.022*Math.pow(10, 23)
double numOfMoleculesInCan= numOfMoleculesPermol/moleOfGass*volumeOfCan
println "volume of Can = " + volumeOfCan 
println "Can Height = " + guessCanHieght 
println "1 mole Of Gass = " + 22.4
println "Number of molecules per mol = " + numOfMoleculesPermol
double computedPressure = numOfMoleculesInCan*287.0*273.15/(volume-volumeOfCan)
double computedPressureDelta = numOfMoleculesInCan*287.0*273.15/(volumeOfCan)
double deltaPressure = computedPressureDelta-computedPressure
println "Testing standard pressure is: "+computedPressureDelta
println "Change in pressure from speaker "+deltaPressure






println "Final Computer Pressure = " + computedPressure 
