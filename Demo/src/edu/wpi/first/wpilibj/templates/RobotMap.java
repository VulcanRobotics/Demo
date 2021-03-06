package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//this class keeps track of where each motor, solenoid, joystick, and sensor is plugged in
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static final int leftMotorPWM = 1;
    public static final int rightMotorPWM = 2;
    
    public static final int shooterPWM = 3;
    public static final int triggerPWM = 4;
    
    public static final int driverJoystick = 1;
    
    public static final int shooterButton = 1;
    
    
}
