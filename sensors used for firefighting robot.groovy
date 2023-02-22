// code here
def cliffSensor ='RobotRoombaCliffSensor'// this will measure the distance between the robot base  light from the floor// 
def bumpSensor =  'Bumper Actuatorss'//tels when Robot is to close to a wall so it can can follow it 
def IRcamera ='DFRobot ir cam'//to sense fire 
println "1#The puffer will start at 0 degrees and move to 180 degrees left to right"
println "2# the puffer will start pointing straight at a 90 degree angle move -33degrees twice down to 57 degrees then move down 24 degrees trying sense firethen go straight to starting point then go up +33 degrees to 123 degrees then 156 degrees searching for a fire by the IR cam"
println "3# if the situation has more than 1 fire then then the robot will move straight until it either senses another fire if the robot senses another fire then it will extinguish the fire if the robot does not sense a fire then it will continue to move straight until it bumps into a wall it will then follow the wall untill meeting another fire" 
print cliffSensor + '___'
print bumpSensor + '____'
print IRcamera + '___'