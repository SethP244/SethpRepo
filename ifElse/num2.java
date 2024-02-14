import java.util.Scanner;

class ifElse 
{
    public static void main(String args[])
{

Scanner input = new Scanner(System.in);
System.out.println("Please type your age:");
int number = input.nextInt();

while(true)
{if(number <= 0)
{
System.out.println("Please re-type your age:");
number = input.nextInt();
}
if(number > 0)
{break;}
}

if(number >= 1 < 12)
{System.out.println("You are a child");}
else
if(number >= 12 < 18)
{System.out.println("You are a teenager");}
else
if(number >= 18 < 60)
{System.out.println("You are an adult");}
else
if(number >= 60 < 122)
{System.out.println("You are a senior citizen");}
else
if(number >= 122)
{System.out.println("You are dead");}






}











}