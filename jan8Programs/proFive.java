import java.util.Scanner;

class jan8Programs 
{
    public static void main(String args[])
    {
        Scanner intIn =  new Scanner(System.in);

        System.out.println("Enter any whole number:" );
        int outNum = intIn.nextInt();
        int finOut = outNum % 7;

        if(finOut == 0)
        {
        System.out.println(outNum + " is evenly divisable by 7" );
        }
        else
        {
            System.out.println(outNum + " is not evenly divisable by 7" );
        }

        




    }
    
    
    
    
    }