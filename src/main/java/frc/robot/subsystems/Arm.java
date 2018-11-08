/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  private static DoubleSolenoid Arm = RobotMap.Arm;
  private static DoubleSolenoid Punch = RobotMap.Punch;
  private static DigitalInput UpperArmSensor = RobotMap.UpperArmSensor;
  private static DigitalInput LowerArmSensor = RobotMap.LowerArmSensor;
  private static VictorSP LeftIntake = RobotMap.LeftIntake;
  private static VictorSP RightIntake = RobotMap.RightIntake;
  private static DoubleSolenoid Gripper = RobotMap.Gripper;
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
