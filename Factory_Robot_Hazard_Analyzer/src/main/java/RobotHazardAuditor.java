public class RobotHazardAuditor {

    // Encapsulated method to get machinery risk factor
    private double getMachineRiskFactor(
            String machineryState)
            throws RobotSafetyException {

        // Map machinery state to risk factor
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

    // Public method to calculate robot hazard risk
    public double CalculateHazardRisk(
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

        // Get risk factor using machinery state
        double machineRiskFactor =
                getMachineRiskFactor(machineryState);

        // Calculate final hazard risk score
        double risk = ((1.0 - armPrecision) * 15.0)
                + (workerDensity * machineRiskFactor);

        return risk;
    }
}
