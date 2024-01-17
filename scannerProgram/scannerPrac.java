import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
    { 
        Scanner firstName = new Scanner(System.in);
        Scanner middleI = new Scanner(System.in);
        Scanner lastName = new Scanner(System.in);

        System.out.println("Please, Enter your first name:" );
        String fn = firstName.nextLine();
        System.out.println("Please, Enter your middle intial:" );
        String mI = middleI.nextLine();
        System.out.println("Please, Enter your last name:" );
        String ln = lastName.nextLine();
        System.out.println("Hello, " + fn + " " + mI + " " + ln + "!");

        firstName.close();
        lastName.close();
        middleI.close();






    }
}