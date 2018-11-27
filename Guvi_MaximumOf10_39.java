import java.io.*;
import java.util.*;

class Guvi_MaximumOf10_39
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int max,i;
		
		
		int arr[]=new int[10];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<10;i++)
			arr[i]=sc.nextInt();
		
		
		
		max=- 2147483648;
		
		
		for(i=0;i<10;i++)
		{
			if(arr[i]>max)
				max=arr[i];
				
		}
		
		System.out.println("Maximum is "+max);
	}
}
