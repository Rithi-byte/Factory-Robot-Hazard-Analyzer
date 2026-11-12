import java.util.Scanner;

public class UC3_HazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept inputs
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        // Temporary risk factor until UC7 introduces state mapping
        double machineRiskFactor = 1.3;

        // Calculate hazard risk score
        double risk = ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);

        // Display the result
        System.out.println("Robot Hazard Risk Score: " + risk);

        sc.close();
    }
}
