import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
{
    Scanner var1 =  new Scanner(System.in);

    System.out.println("Please, Enter a number:" );
    int stNum = var1.nextInt();


    
    int finalNum = 2 * stNum;
    System.out.println("The number doubled is: " + finalNum );
}
}
