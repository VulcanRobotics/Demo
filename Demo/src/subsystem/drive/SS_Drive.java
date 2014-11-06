/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsystem.drive;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 1218
 */
public class SS_Drive extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Jaguar leftMotors = new Jaguar(RobotMap.leftMotorPWM);
    Jaguar rightMotors = new Jaguar(RobotMap.rightMotorPWM);
    
    //this is the built in drive system that first provides.
    //it greatly simplifies the math to drive the robot
    RobotDrive chassis = new RobotDrive(leftMotors, rightMotors);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //this command needs to always run so the drivetrain will always respond to joystick input.
        setDefaultCommand(new C_Drive());
    }
    
    public void arcade(float power, float heading) {
        
        //arcade calculates the needed power to each motor based on the turn speed and power
        chassis.arcadeDrive(power, heading);
        Timer.delay(0.05);
    }
}
