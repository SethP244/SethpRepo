import java.util.Scanner;

class RNG 
{
    public static void main(String args[])
{

Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Basic Calculator");
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int choice = scanner.nextInt();
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        switch(choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if(num2 != 0)
                    result = num1 / num2;
                else
                    System.out.println("Error! Division by zero.");
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        if(choice >= 1 && choice <= 4)
            System.out.println("Result: " + result);
        
        scanner.close();



}


}