import java.util.Scanner;

class scannerProgram 
{
    public static void main(String args[])
{
Scanner moneyInput = new Scanner(System.in);

System.out.println("Please, Enter your annual income (#####.##):" );
float mI = moneyInput.nextFloat();

// to check if the input is a negative number
while(true){
if(mI <= 0.0)
{
System.out.println("Please, Re-enter your annual income (#####.##):" );
 mI = moneyInput.nextFloat();
}

//if correctly formatted input
if(mI> 0.0)
{
    break;
}}

float dmI = mI/365;
float hmI = dmI/24;
float mmI = hmI/60;
System.out.println("Your income is " + "$" +mmI + "/minute" );
System.out.println("I divided your annual income by 365 days to get the daily income, then I divided your daily income by 24 hours to get the hourly income." );
System.out.println("Finally, I divided your hourly income by 60 minutes to get the per- minute income. Which is " + mmI + "/minute");










}

}
   