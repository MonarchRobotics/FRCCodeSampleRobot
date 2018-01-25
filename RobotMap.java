package all;

/**
 * The robot.all.RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //basically just holds all the ports
    //a lot easier to change motor ports this way
    private static final int frontLeft = 1;
    private static final int frontRight = 2;
    private static final int rearLeft = 3;
    private static final int rearRight = 4;

    private static final int leftArmOfZanathyr = 5;
    private static final int rightArmOfZanathyr = 6;

    private static final int forwardLifterChannel = 1;
    private static final int reverseLifterChannel = 2;
    private static final int forwardLifterPressureChannel = 3;
    private static final int reverseLifterPressureChannel = 4;

    private static final double translationalDeadZone = 0.1;
    private static final double rotationalDeadZone = 0.1;

    public static int getFrontLeft() { return frontLeft; }
    public static int getFrontRight() { return  frontRight; }
    public static int getRearLeft() { return rearLeft; }
    public static int getRearRight() { return rearRight; }

    public static int getLeftArmOfZanathyr() { return leftArmOfZanathyr; }
    public static int getRightArmOfZanathyr() { return rightArmOfZanathyr; }

    public static int getForwardLifterChannel() { return forwardLifterChannel; }
    public static int getReverseLifterChannel() { return reverseLifterChannel; }
    public static int getForwardLifterPressureChannel() { return forwardLifterPressureChannel; }
    public static int getReverseLifterPressureChannel() { return reverseLifterPressureChannel; }

    public static double getTranslationalDeadzone() {
        if (translationalDeadZone == 1) {
            return 0.99;
        }
        return translationalDeadZone;
    }
}
