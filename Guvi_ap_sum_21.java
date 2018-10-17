import java.io.*;
import java.util.*;

class Guvi_ap_sum_21
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int n,d,a,an;
		
		float sum;

		System.out.println("Enter the number of terms n, first term a and common differnce d of the arithmetic progression");
		n=sc.nextInt();		
		a=sc.nextInt();
		d=sc.nextInt();
		
		an=a+(n-1)*d;
		
		sum=((n)*(a+an))/2;

		System.out.println("Sum of A.P. is "+sum);
		

	}
}