import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
{
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years):");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        // Close the scanner
        scanner.close();
}
}