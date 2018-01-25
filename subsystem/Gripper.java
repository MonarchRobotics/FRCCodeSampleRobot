package all.subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import all.command.ZanathyrsGrasp;

/**
 * Created by Zelie on 1/24/18.
 */
public class Gripper extends Subsystem {

    public WPI_TalonSRX leftArmOfZanathyr, rightArmOfZanathyr;

    public Gripper(int leftPort, int rightPort) {
        this.leftArmOfZanathyr = new WPI_TalonSRX(leftPort);
        this.rightArmOfZanathyr = new WPI_TalonSRX(rightPort);

        this.leftArmOfZanathyr.setInverted(true);
        this.rightArmOfZanathyr.setInverted(false);
    }

    @Override
    protected void initDefaultCommand() { setDefaultCommand(new ZanathyrsGrasp()); }

}
