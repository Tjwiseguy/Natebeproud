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
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 * @author Tony W
 */
public class Arm extends Subsystem {
  private static DoubleSolenoid piston = RobotMap.armPiston;
  private static DoubleSolenoid punch = RobotMap.Punch;
  private static DigitalInput upperArmSensor = RobotMap.UpperArmSensor;
  private static DigitalInput lowerArmSensor = RobotMap.LowerArmSensor;
  private static VictorSP leftIntake = RobotMap.LeftIntake;
  private static VictorSP rightIntake = RobotMap.RightIntake;
  private static DoubleSolenoid gripper = RobotMap.Gripper;
  private Value forward = DoubleSolenoid.Value.kForward;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  /**
   * Raises Robot Arm up
   */
  public void Up(){
    piston.set(forward);

  }
  /**
   * Lowers Robot Arm down
   */
  public void down(){
    piston.set(DoubleSolenoid.Value.kReverse);
  }
  /**
   * @return UpperArmSensor true/false
   */
  public boolean getUpper(){
    return upperArmSensor.get();
  }
  public double WllToLive(){
    return 0;
  }
  public void Stop(){
    piston.set(DoubleSolenoid.Value.kOff);

  }
}
