import java.io.*;
import java.util.*;

class Guvi_max_ele_22
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int max,n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		
		max=- 2147483648;
		
		
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
				
		}
		
		System.out.println("Maximum is "+max);
	}
}