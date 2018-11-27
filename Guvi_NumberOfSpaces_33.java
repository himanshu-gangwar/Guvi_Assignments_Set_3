import java.io.*;

class Guvi_NumberOfSpaces_33
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
		
	int i,l,c=0;
	char ch;
	
	l=str.length();

	
	for(i=0;i<l;i++)
	{
		ch=str.charAt(i);
	
		if(ch==' ')
			c++;		
			
		
	}

	System.out.println("No. of spaces are "+c);

    } 
} 
