/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;
  public WPI_TalonSRX leftmotor1 = new WPI_TalonSRX(4);
  public WPI_TalonSRX leftmotor2 = new WPI_TalonSRX(5);
  public WPI_TalonSRX rightmotor1 = new WPI_TalonSRX(1);
  public WPI_TalonSRX rightmotor2 = new WPI_TalonSRX(2);
  public SpeedControllerGroup Left = new SpeedControllerGroup(leftmotor1, leftmotor2);
  public SpeedControllerGroup Right = new SpeedControllerGroup(rightmotor1, rightmotor2);
  public DifferentialDrive DriveTrain = new DifferentialDrive(Left, Right);
  public Encoder LeftEncoder = new Encoder(0,1);
  public Encoder RightEncoder = new Encoder(2,3);
  public DoubleSolenoid Arm = new DoubleSolenoid(2, 3);
  public DoubleSolenoid Punch = new DoubleSolenoid(4,5);
  public DigitalInput UpperArmSensor = new DigitalInput(4);
  public DigitalInput LowerArmSensor = new DigitalInput(5);
  p
public void Init(){

}
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
