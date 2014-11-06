/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsystem.shooter;

import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 *
 * @author 1218
 */
public class C_Shoot extends CommandBase {
    
    public C_Shoot() {
        // Use requires() here to declare subsystem dependencies
        
        //shoote is declared in command base
        //makes sure no other command is using the subsystem at the same time
        requires(shooter);
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(0.5); //starts a timer with a timeout or 0.5 seconds
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //spinners always need to be on while getting ready to fire
        shooter.startSpinners();
        
        //wait 0.5 seconds, then start trigger
        if (isTimedOut()) {
            shooter.shoot();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        //when button is released, stop all motors to save power and prevent accedentally firing frisbees
        shooter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
