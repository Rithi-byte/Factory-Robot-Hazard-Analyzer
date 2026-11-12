import java.util.Scanner;

public class UC7_HazardAnalyzer {

    // Returns the risk factor based on machinery state
    public static double getMachineRiskFactor(
            String machineryState)
            throws RobotSafetyException {

        // Case-sensitive machinery state mapping
        switch (machineryState) {

            case "Worn":
                return 1.3;

            case "Faulty":
                return 2.0;

            case "Critical":
                return 3.0;

            default:
                throw new RobotSafetyException(
                        "Error: Unsupported machinery state"
                );
        }
    }

    // Validates inputs and calculates the hazard risk
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

        // Get machinery risk factor
        double machineRiskFactor =
                getMachineRiskFactor(machineryState);

        // Calculate hazard risk score
        return ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept user inputs
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        try {

            // Call calculation method
            double risk = calculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Display calculated score
            System.out.println(
                    "Robot Hazard Risk Score: " + risk
            );

        }
        catch (RobotSafetyException e) {

            // Handle custom exception
            System.out.println(e.getMessage());

        }

        sc.close();
    }
}
