import java.util.Scanner;

public class UC5_HazardAnalyzer {

    // Separate method for validation and risk calculation
    public static double calculateHazardRisk(
            double armPrecision,
            int workerDensity,
            String machineryState) {

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {

            System.out.println(
                    "Error: Arm precision must be 0.0-1.0"
            );

            return -1;
        }

        // Validate worker density
        if (workerDensity < 1 || workerDensity > 20) {

            System.out.println(
                    "Error: Worker density must be 1-20"
            );

            return -1;
        }

        // Temporary factor until UC7
        double machineRiskFactor = 1.3;

        // Calculate and return risk score
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

        // Call the separate method
        double risk = calculateHazardRisk(
                armPrecision,
                workerDensity,
                machineryState
        );

        // Display result only if valid
        if (risk != -1) {
            System.out.println(
                    "Robot Hazard Risk Score: " + risk
            );
        }

        sc.close();
    }
}
