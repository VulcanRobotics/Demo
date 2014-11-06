
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
  
    //declares a joystick instance
    public static Joystick driverJoystick = new Joystick(RobotMap.driverJoystick);
   
    //button to control shooter
    Button shooterButton = new JoystickButton(driverJoystick, RobotMap.shooterButton);
        
    public OI (){
        //when the button to shoot is pressed down, its runs the command c_shoot in subsystem.shoot
        //when it is released, it ends the command
          shooterButton.whileHeld(new C_Shoot());
    }
    
}

