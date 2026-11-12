// Custom checked exception
public class RobotSafetyException extends Exception {

    // Constructor passes the error message to Exception
    public RobotSafetyException(String message) {
        super(message);
    }
}
