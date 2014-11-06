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
    RobotDrive chassis = new RobotDrive(leftMotors, rightMotors);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new C_Drive());
    }
    
    public void arcade(float power, float heading) {
        chassis.arcadeDrive(power, heading);
        Timer.delay(0.05);
    }
}
