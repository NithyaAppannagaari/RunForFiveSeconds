// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.Drivetrain;

public class Drive5Seconds extends CommandBase {
  // create field for Drivetrain
  // create field that holds the starting time

  /** Creates a new Drive5Seconds. */
  public Drive5Seconds(DriveTrain drivetrainIn) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements();
    // initialize the fields
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //use Timer.getFPGATimestamp() to set the starting time
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //call the runMotors() method of Drivetrain
    //make sure to pass in the right parameters
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //call the stopMotors() method of Drivetrain
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
    // return true when 5 seconds have past (use Timer.getFPGATimestamp())
  }
}
