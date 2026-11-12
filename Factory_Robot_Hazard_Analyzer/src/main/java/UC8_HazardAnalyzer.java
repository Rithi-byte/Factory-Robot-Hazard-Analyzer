import java.util.Scanner;

public class UC8_HazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Accept arm precision
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        // Accept worker density
        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        // Accept machinery state
        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        // Create RobotHazardAuditor object
        RobotHazardAuditor auditor =
                new RobotHazardAuditor();

        try {

            // Call the auditor's business logic method
            double risk = auditor.CalculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Display the calculated hazard score
            System.out.println(
                    "Robot Hazard Risk Score: " + risk
            );

        }
        catch (RobotSafetyException e) {

            // Handle and display custom exception message
            System.out.println(e.getMessage());

        }

        // Close Scanner
        sc.close();
    }
}
