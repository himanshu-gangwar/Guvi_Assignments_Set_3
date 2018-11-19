import java.io.*;
import java.util.*;

class Guvi_median_ele_25
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		int key,n,i,j,median;
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
		
		if(n%2==0)
			median=(arr[n/2]+arr[(n/2)-1])/2;
		
		else
			median=arr[n/2];
		
		System.out.println("Median is "+median);
	}
}