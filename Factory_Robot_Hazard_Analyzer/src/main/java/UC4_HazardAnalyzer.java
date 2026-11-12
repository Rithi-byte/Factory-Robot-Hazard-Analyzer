import java.util.Scanner;
import java.util.Map;
public class UC4_HazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept inputs
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        // Validate arm precision
        if (armPrecision < 0.0 || armPrecision > 1.0) {

            System.out.println(
                    "Error: Arm precision must be 0.0-1.0"
            );

        }
        // Validate worker density
        else if (workerDensity < 1 || workerDensity > 20) {

            System.out.println(
                    "Error: Worker density must be 1-20"
            );

        }
        else {

            // Temporary factor until UC7
            double machineRiskFactor = 1.3;

            // Calculate risk score
            double risk = ((1.0 - armPrecision) * 15.0)
                    + (workerDensity * machineRiskFactor);

            System.out.println(
                    "Robot Hazard Risk Score: " + risk
            );
        }

        sc.close();
    }
}
