/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Drivetrain extends Subsystem {
  private WPI_TalonSRX leftmotor1 = RobotMap.leftmotor1;
  private WPI_TalonSRX leftmotor2 = RobotMap.leftmotor2;
  private WPI_TalonSRX rightmotor1 = RobotMap.rightmotor1;
  private WPI_TalonSRX rightmotor2 = RobotMap.rightmotor2;
  private SpeedControllerGroup Left = RobotMap.Left;
  private SpeedControllerGroup Right = RobotMap.Right;
  private DifferentialDrive DriveTrain = RobotMap.DriveTrain;
  private Encoder LeftEncoder = RobotMap.LeftEncoder;
  private Encoder RightEncoder = RobotMap.RightEncoder;
  private static AHRS NavX = RobotMap.NavX;
  private static DoubleSolenoid Shifter = RobotMap.Shifter;

  public void DriveOP(Joystick jStick){
    DriveTrain.arcadeDrive(jStick.getY(), jStick.getZ());

  }


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
