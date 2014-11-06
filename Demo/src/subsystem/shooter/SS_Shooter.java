/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsystem.shooter;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author 1218
 */
public class SS_Shooter extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Jaguar shooterMotor = new Jaguar(RobotMap.shooterPWM);
    Jaguar triggerMotor = new Jaguar(RobotMap.triggerPWM);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
   
    }
    
    public void shoot() {
        
        triggerMotor.set(1);
    }
    
    public void startSpinners() {
        shooterMotor.set(0.7);
    }
    public void stop() {
        shooterMotor.stopMotor();
        triggerMotor.stopMotor();
    }
}
