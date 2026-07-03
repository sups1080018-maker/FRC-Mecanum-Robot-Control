// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.xml.sax.SAXException;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;


public class Robot extends TimedRobot {
  Joystick stick= new Joystick(0);
  Spark RF = new Spark(0);
  Spark LF = new Spark(1);
  Spark LR = new Spark(8);
  Spark RR =new Spark(9);
  MotorControllerGroup R =new MotorControllerGroup(RF,RR);
  MotorControllerGroup L=new MotorControllerGroup(LF, LR);
  DifferentialDrive drive=new DifferentialDrive(L,R);
  DoubleSolenoid rg=new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 4, 5);
  DoubleSolenoid lg=new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 7, 6);


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
    drive.tankDrive(-0.7*stick.getRawAxis(1),0.7*stick.getRawAxis(5));

    if(stick.getRawButtonPressed(1)){
      rg.set(Value.kForward);
      lg.set(Value.kForward);
    }else if(stick.getRawButtonPressed(2)){
      rg.set(Value.kReverse);
      lg.set(Value.kReverse);
    } else{
      rg.set(Value.kOff);
      lg.set(Value.kOff);

    }
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
