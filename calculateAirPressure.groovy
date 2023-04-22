// code here
double kilopacal= 101.325 //converstion scaler 
double diameterOfTheSpeaker = 7*25.4/1000.0 //measured
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
double guessCanHieght =10*25.4/1000.0
double volumeOfCan= Math.PI*radiusOfTheSpeaker*radiusOfTheSpeaker*guessCanHieght
double moleOfGass = 22.4 // this is liters
println "volume of Can" + volumeOfCan 
println "Can Height" + guessCanHieght 
println "1 mole Of Gass" + 22.4