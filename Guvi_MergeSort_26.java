import java.io.*;
import java.util.Scanner;

class MergeSort  
{  
    void merging(int a[], int b, int m, int e)  
    {  
	      
	    int l,r,i,j,k;
	    
	    l=m-b+1;  
	    r=e-m;  
	      
	    int LA[] = new int[l];  
	    int RA[] = new int[r];  
	      
	    for(i=0;i<l;++i)  
	    	LA[i]=a[b+i];  
	      
	    for(j=0;j<r;++j)  
	    	RA[j]=a[m+1+j];  
	      
	      
	    i=0;
	    j=0;
	      
	    k=b;
	      
	    while(i<l && j<r)  
	    {  
		    if(LA[i]<=RA[j])  
		    {  
			    a[k]=LA[i];  
			    i++;  
		    }  
		    
		    else  
		    {  
			    a[k]=RA[j];  
			    j++;  
		    }  
		    
		    k++;  
	    }  
	    
	    while(i<l)  
	    {  
		    a[k]=LA[i];  
		    i++;  
		    k++;  
	    }  
	      
	    while(j<r)  
	    {  
		    a[k]=RA[j];  
		    j++;  
		    k++;  
	    }  
    }  
      
    void sort(int a[],int b,int e)  
    {  
	    if(b<e)  
	    {  
		    int m=(b+e)/2;  
		    
		    sort(a,b,m);  
		    sort(a,m+1,e);  
		    merging(a,b,m,e);  
	    }  
    }
}

class Guvi_MergeSort_26
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
			
		
		MergeSort ob = new MergeSort();  
		
    		ob.sort(arr,0,n-1);  
      
    		System.out.println("Sorted array");  
    		
    		for(i=0;i<n;i++)  
   		{  
       			System.out.print(arr[i]+" ");
       		} 
       		
       		System.out.println();  
       	}  
}  
