package all.subsystem;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Created by Zelie on 1/25/18.
 */
public class Lifter extends Subsystem {

    DoubleSolenoid lifterSolenoid, pressureSolenoid;

    public void initDefaultCommand() {

    }

    public Lifter(int forwardLifterChannel, int reverseLifterChannel, int forwardPressureChannel, int reversePressureChannel) {

        lifterSolenoid = new DoubleSolenoid(forwardLifterChannel, reverseLifterChannel);

        lifterSolenoid.set(DoubleSolenoid.Value.kReverse);

        pressureSolenoid = new DoubleSolenoid(forwardPressureChannel, reversePressureChannel);

        pressureSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void setForward() {
        lifterSolenoid.set(DoubleSolenoid.Value.kForward);
        SmartDashboard.putBoolean("Lifted", true);
    }
    public void setReverse() {
        lifterSolenoid.set(DoubleSolenoid.Value.kReverse);
        SmartDashboard.putBoolean("Lifted", true);
    }

    public DoubleSolenoid.Value getValue() { return lifterSolenoid.get(); }
    public DoubleSolenoid.Value getAirPressure() { return pressureSolenoid.get(); }
}
