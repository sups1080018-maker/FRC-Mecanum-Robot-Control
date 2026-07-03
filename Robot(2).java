// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.MecanumDrive;


public class Robot extends TimedRobot {
  Joystick stick=new Joystick(0);
  CANSparkMax LF=new CANSparkMax(3, MotorType.kBrushless);
  CANSparkMax LR=new CANSparkMax(4, MotorType.kBrushless);
  CANSparkMax RF=new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax RR=new CANSparkMax(2, MotorType.kBrushless);
  MecanumDrive abc=new MecanumDrive(LF, LR, RF, RR);

  //MecanumDrive abc=
  
  @Override
  public void robotInit() {}

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    abc.driveCartesian(0.7*stick.getRawAxis(1),0.7*stick.getRawAxis(0),0.7*stick.getRawAxis(4));
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
