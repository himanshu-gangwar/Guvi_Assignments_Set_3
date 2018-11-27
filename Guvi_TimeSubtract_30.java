import java.io.*;

class Guvi_TimeSubtract_30
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int h1,min1,h2,min2,nh,nmin;

		
		System.out.println("Enter the hours of first time");
		h1=Integer.parseInt(in.readLine());
	
		System.out.println("Enter the minutes of first time");
		min1=Integer.parseInt(in.readLine());
		
		if(min1>59)
		{
			System.out.println("Minutes should to less that 59");
			System.exit(0);
		}
		
		System.out.println("\n"+h1+" "+min1+"\n");
		
		System.out.println("Enter the hours of second time");
		h2=Integer.parseInt(in.readLine());
	
		System.out.println("Enter the minutes of second time");
		min2=Integer.parseInt(in.readLine());
		
		if(min2>59)
		{
			System.out.println("Minutes should to less that 59");
			System.exit(0);
		}
			
		System.out.println("\n"+h2+" "+min2+"\n");
					
		if(h1*60+min1>=h2*60+min2)
		{
			if(min1>=min2)
				nmin=min1-min2;
			else
			{
				h1-=1;
				nmin=min1+60-min2;
			}
			
			nh=h1-h2;
		
		}
		else
		{
			if(min2>=min1)
				nmin=min2-min1;
			else
			{
				h2-=1;
				nmin=min2+60-min1;
			}
			
			nh=h2-h1;
		
		}
		
		System.out.println(nh+" "+nmin);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
}
