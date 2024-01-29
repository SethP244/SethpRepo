import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
{
    Scanner var1 =  new Scanner(System.in);

    System.out.println("Please, Enter a number:" );
    int stNum = var1.nextInt();


    System.out.println("Please, Enter another number:" );
    int ndNum = var1.nextInt();
    int finalNum = ndNum + stNum;
    System.out.println("Both numbers added are: " + finalNum );

}
}