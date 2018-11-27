import java.io.*;
import java.util.*;

class Guvi_Fibonacci_40
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n,i,a=1,b=1,c=0;
		
				
		System.out.println("Enter the number of terms you want in fibonacci series");
			n=sc.nextInt();
		
		
		System.out.print("\n"+a+" "+b);	
		
		
		for(i=1;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);			
		}
	System.out.println();
	
	}
}
