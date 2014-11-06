
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import subsystem.shooter.C_Shoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
    public static Joystick driverJoystick = new Joystick(RobotMap.driverJoystick);
   
    Button shooterButton = new JoystickButton(driverJoystick, RobotMap.shooterButton);
        
    public OI (){
          shooterButton.whileHeld(new C_Shoot());
    }
    
}

