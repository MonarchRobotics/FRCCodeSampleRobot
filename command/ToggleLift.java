package all.command;

import all.OI;
import edu.wpi.first.wpilibj.command.Command;
import all.Robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Created by Zelie on 1/25/18.
 */
public class ToggleLift extends Command {

    public ToggleLift() { requires(Robot.lifter); }

    protected void execute() {
        if (OI.driverPad.getAButtonPressed()) {
            if (Robot.lifter.getValue() == DoubleSolenoid.Value.kForward) {
                Robot.lifter.setReverse();
            } else {
                Robot.lifter.setForward();
            }
        }
    }

    @Override
    protected boolean isFinished() { return false; }
}
