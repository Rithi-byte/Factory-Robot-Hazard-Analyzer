import java.util.Scanner;

public class UC2_HazardAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);

        // Read arm precision
        System.out.print("Enter arm precision: ");
        double armPrecision = sc.nextDouble();

        // Read worker density
        System.out.print("Enter worker density: ");
        int workerDensity = sc.nextInt();

        // Read machinery state
        System.out.print("Enter machinery state: ");
        String machineryState = sc.next();

        // Display the entered inputs
        System.out.println("Arm Precision: " + armPrecision);
        System.out.println("Worker Density: " + workerDensity);
        System.out.println("Machinery State: " + machineryState);

        sc.close();
    }
}
