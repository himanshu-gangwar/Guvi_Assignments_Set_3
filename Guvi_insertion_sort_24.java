import java.io.*;
import java.util.*;

class Guvi_insertion_sort_24
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int key,n,i,j;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the elements in the array");
		
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		for(j=1;j<n;j++)
		{	
			i=j-1;
			key=arr[j];
			while(i>=0&&arr[i]>key)
			{
				arr[i+1]=arr[i]; 
				i=i-1; 
			} 
			arr[i+1]=key; 				
		}
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println();
	}
}