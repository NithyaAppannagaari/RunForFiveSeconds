# RunForFiveSeconds

Use the starter code to program a kitbot to drive forward for five seconds.
## Set up
1. Have jdk installed
2. Have git installed
3. Clone this repo onto your computer using git clone [url].git
4. Start working on this assignment
## Complete Drive5Seconds.java and Drivetrain.java
### Drivetrain.java
* Attributes
    * 4 TalonSRX motors
* Complete the constructor
    * Instantiate the TalonSRX motors
* Complete the following methods
    * runMotors()
      * Runs the motors given the motor speed of the right and left motors
    * stopMotors() 
      * Stops the motors
### Drive5Seconds.java
* Complete the following methods
    * initialize()
       * Records the starting time
    * execute() 
      * Runs the motors of the kitbot
    * end() 
      * Stops the motors of the kitbot
    * isFinished() 
      * Returns true if five seconds have passed
