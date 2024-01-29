import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
{
    Scanner var1 =  new Scanner(System.in);

    System.out.println("Please, Enter your birthyear:" );
    int stNum = var1.nextInt();


    System.out.println("Please, Enter the current year:" );
    int ndNum = var1.nextInt();
    int finalNum = ndNum - stNum;
    System.out.println("Your age should be: " + finalNum );
}
}