import java.io.*;
import java.util.Scanner;

class Guvi_SwapBitwise_38
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	int a,b;

	System.out.println("Enter the first number");
	a=sc.nextInt();

	System.out.println("Enter the second number");
	b=sc.nextInt();
	
	System.out.println("Numbers before swapping.\na= "+a+" and b= "+b+".\n");		
	
	a=a^b;
	b=a^b;
	a=a^b;

	System.out.println("Numbers after swapping.\na= "+a+" and b= "+b+".\n");
	}
}
