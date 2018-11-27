import java.io.*;
import java.util.StringTokenizer;

class Guvi_NumberOfLines_34
{
    public static void main(String args[])throws IOException
    { 
 
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));	
		
	String str;

	System.out.println("Enter the string");
	str=in.readLine();

	StringTokenizer c = new StringTokenizer(str,".");
    	
	System.out.println("No. of lines are "+c.countTokens());

    } 
} 
