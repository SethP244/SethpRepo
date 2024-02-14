import java.util.Scanner;

class ifElse 
{
    public static void main(String args[])
{

Scanner numInput = new Scanner(System.in);
c
int number = numInput.nextInt();

int output = number % 2;

if(output == 1)
{
System.out.println(number + " is a odd number. ");

}
else
{
    System.out.println(number + " is an even number. ");

}

}



}