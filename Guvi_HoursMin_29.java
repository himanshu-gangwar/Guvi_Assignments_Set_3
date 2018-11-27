import java.io.*;

class Guvi_HoursMin_29
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	try
	{
		int min,h;

		System.out.println("Enter the minutes");
		min=Integer.parseInt(in.readLine());
	
			
		if(min<=59)
			h=0;
		else
		{
			h=min/60;
			min=min%60;
		
		}
			System.out.println(h+" "+min);
	}
	catch(Exception e)
	{
	System.out.println("Only Digits are allowed");
	}
    } 
} 
