import java.io.*;
import java.util.Scanner;

class Guvi_Arrayindexes_28 
{
	public static void main(String args[]) 
    	{ 
        
		Scanner sc=new Scanner(System.in);
	
		int n,i;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
	
		int arr[]=new int[n];
	
		System.out.println("Enter the elements in the array");
	
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();

		for(i=0;i<n;i++)
			System.out.println(arr[i]+" "+i);
	}
}

