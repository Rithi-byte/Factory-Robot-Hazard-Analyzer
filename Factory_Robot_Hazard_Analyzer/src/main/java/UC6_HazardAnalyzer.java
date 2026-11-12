import java.util.Scanner;

public class UC6_HazardAnalyzer {

    // Method validates inputs and throws custom exceptions
    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState)
            throws RobotSafetyException {

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {

            throw new RobotSafetyException(
                    "Error: Arm precision must be 0.0-1.0"
            );
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {

            throw new RobotSafetyException(
                    "Error: Worker density must be 1-20"
            );
        }

        // Temporary factor until UC7
        double machineRiskFactor = 1.3;

        // Calculate risk score
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept inputs
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        try {

            // Call method that may throw an exception
            double risk = calculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            System.out.println(
                    "Robot Hazard Risk Score: " + risk
            );

        }
        catch (RobotSafetyException e) {

            // Display the exception message
            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
