import java.io.*;
import java.util.Scanner;

class Guvi_Swap_37
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	int a,b,temp;

	System.out.println("Enter the first number");
	a=sc.nextInt();

	System.out.println("Enter the second number");
	b=sc.nextInt();
	
	System.out.println("Numbers before swapping.\na= "+a+" and b= "+b+".");		
	
	temp=a;
	a=b;
	b=temp;

	System.out.println("Numbers after swapping.\na= "+a+" and b= "+b+".");
	}
}
