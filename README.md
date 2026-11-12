# Factory Robot Hazard Analyzer

## Project Overview

The **Factory Robot Hazard Analyzer** is a Java-based application designed to evaluate potential safety risks in a factory environment involving industrial robots and workers.

The application calculates a hazard risk score based on three major inputs:

- **Arm Precision:** Measures the precision of the robot's arm.
- **Worker Density:** Represents the number of workers in the operating area.
- **Machinery State:** Indicates the current condition of the machinery.

The project is developed incrementally through eight use cases (UC1–UC8), progressing from basic input handling to a modular, object-oriented application with custom exception handling.

## Objectives

- Understand Java fundamentals and user input handling.
- Implement arithmetic operations and business logic.
- Apply conditional statements for input validation.
- Separate validation and calculation logic into methods.
- Implement custom exception handling.
- Map machinery conditions to corresponding risk factors.
- Apply object-oriented programming principles.
- Develop modular, reusable, and maintainable Java code.

## Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| IntelliJ IDEA | Development environment |
| Git | Version control |
| GitHub | Source code management |

## Project Structure

```text
Factory-Robot-Hazard-Analyzer/
│
├── .idea/
│
├── Factory_Robot_Hazard_Analyzer/
│   └── src/
│       └── main/
│           └── java/
│               ├── .gitkeep
│               ├── FactoryRobotHazardAnalyzer.java
│               ├── main.java
│               ├── RobotHazardAuditor.java
│               ├── RobotSafetyException.java
│               ├── UC2_HazardAnalyzer.java
│               ├── UC3_HazardAnalyzer.java
│               ├── UC4_HazardAnalyzer.java
│               ├── UC5_HazardAnalyzer.java
│               ├── UC6_HazardAnalyzer.java
│               ├── UC7_HazardAnalyzer.java
│               └── UC8_HazardAnalyzer.java
│
├── out/
└── .gitignore
```

## Application Inputs

| Input | Description | Valid Values |
|---|---|---|
| Arm Precision | Precision of the robot arm | 0.0 to 1.0 |
| Worker Density | Number of workers in the operating area | 1 to 20 |
| Machinery State | Current machinery condition | Worn, Faulty, Critical |

## Hazard Risk Calculation

The hazard risk score is calculated using the following formula:

```text
Hazard Risk Score =
((1.0 - Arm Precision) * 15.0)
+ (Worker Density * Machinery Risk Factor)
```

### Machinery Risk Mapping

| Machinery State | Risk Factor |
|---|---:|
| Worn | 1.3 |
| Faulty | 2.0 |
| Critical | 3.0 |

The machinery state determines the risk factor used in the hazard calculation.

## Use Case Implementation

The project is divided into eight use cases, with each use case introducing a new programming concept or improvement.

### UC1 – Display Static Hazard Message

- Display the application title.
- Introduce the basic Java program structure.
- Use the `FactoryRobotHazardAnalyzer` class.

### UC2 – Accept Robot Hazard Inputs

- Accept arm precision from the user.
- Accept worker density.
- Accept machinery state.
- Use the `Scanner` class for console input.
- Display the entered values.

### UC3 – Calculate Hazard Risk Score

- Perform the hazard risk calculation.
- Apply arithmetic operators.
- Use variables and methods to organize the calculation.
- Display the calculated risk score.

### UC4 – Introduce Input Validation

- Validate arm precision.
- Validate worker density.
- Apply `if-else` conditional statements.
- Display appropriate error messages for invalid inputs.

### UC5 – Refactor Validation into a Separate Method

- Move validation and calculation logic into a separate method.
- Pass input values as method parameters.
- Return the calculated hazard risk score.
- Improve separation of concerns and code readability.

### UC6 – Introduce Custom Exception

- Create a custom exception named `RobotSafetyException`.
- Extend the Java `Exception` class.
- Throw exceptions when invalid inputs are encountered.
- Handle exceptions using `try-catch` blocks.

### UC7 – Machinery State Risk Mapping

- Map machinery states to their corresponding risk factors.
- Support `Worn`, `Faulty`, and `Critical`.
- Handle unsupported machinery states using custom exceptions.
- Encapsulate machinery risk mapping logic.

### UC8 – Fully Modular and OOP-Compliant Hazard Analyzer

- Separate input handling from business logic.
- Implement the `RobotHazardAuditor` class.
- Use custom exception handling for validation.
- Organize the application into reusable components.
- Apply object-oriented programming principles.

## Object-Oriented Programming Concepts

The final use case demonstrates the following concepts:

| Concept | Application |
|---|---|
| Encapsulation | Keeps hazard calculation and related logic within dedicated classes. |
| Abstraction | Exposes the required functionality while hiding internal implementation details. |
| Modularity | Divides the application into separate classes. |
| Single Responsibility Principle | Separates input handling, business logic, and exception handling. |
| Reusability | Allows hazard calculation logic to be reused. |
| Maintainability | Makes the application easier to modify and extend. |

## Input Validation and Exception Handling

The application validates the following conditions:

| Condition | Expected Error Message |
|---|---|
| Arm precision is outside 0.0–1.0 | `Error: Arm precision must be 0.0-1.0` |
| Worker density is outside 1–20 | `Error: Worker density must be 1-20` |
| Machinery state is unsupported | `Error: Unsupported machinery state` |

Invalid inputs are handled using the custom `RobotSafetyException` class in the applicable use cases.

## Sample Execution

### Valid Input

```text
Enter Arm Precision: 0.5
Enter Worker Density: 10
Enter Machinery State: Critical

Robot Hazard Risk Score: 37.5
```

### Invalid Arm Precision

```text
Enter Arm Precision: 1.3
Enter Worker Density: 4
Enter Machinery State: Worn

Error: Arm precision must be 0.0-1.0
```

### Invalid Worker Density

```text
Enter Arm Precision: 0.7
Enter Worker Density: 26
Enter Machinery State: Critical

Error: Worker density must be 1-20
```

### Unsupported Machinery State

```text
Enter Arm Precision: 0.3
Enter Worker Density: 14
Enter Machinery State: Optimal

Error: Unsupported machinery state
```

## How to Run the Project

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA.

3. Navigate to:

```text
Factory_Robot_Hazard_Analyzer/src/main/java/
```

4. Select the required use case Java file.

5. Run the class containing the `main()` method.

6. Enter the requested inputs in the console.

7. Observe the calculated hazard risk score or the corresponding validation error.

**Note:** Run each use case independently to observe how the application evolves from UC1 to UC8.

## Version Control

Git is used to maintain the project history and manage the implementation of individual use cases.

The `develop` branch is used for ongoing development, while `main` represents the final integrated version.

## Conclusion

The Factory Robot Hazard Analyzer demonstrates the progressive development of a Java application through eight use cases. It begins with basic input handling and gradually introduces validation, method decomposition, custom exceptions, machinery risk mapping, and object-oriented design.

The final implementation emphasizes modularity, encapsulation, abstraction, maintainability, and structured exception handling.
