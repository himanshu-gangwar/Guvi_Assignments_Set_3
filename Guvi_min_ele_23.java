import java.io.*;
import java.util.*;

class Guvi_min_ele_23
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int min,n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		
		min=2147483647;
		
		
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
				
		}
		
		System.out.println("Minimum is "+min);
	}
}