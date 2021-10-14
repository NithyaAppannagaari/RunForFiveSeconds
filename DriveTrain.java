// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class DriveTrain extends SubsystemBase {
  // create the 4 TalonSRX motors (rightFront, leftFront, rightBack, leftBack)

  /** Creates a new DriveTrain. */
  public DriveTrain() {
    // instantiate the motors (rightFront, leftFront, rightBack, leftBack)

    // allow the back motors to follow the actions of the front motors

    // set the right motors to be inverted
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void runMotors()
  {
      // set the speed of the front motors (setting the speed of the back motors is not needed as they will follow the front motors)
      // make sure you create parameters for the motor speed as well
  }

  public void stopMotors()
  {
      //set the speed of the motors to 0
  }
}
