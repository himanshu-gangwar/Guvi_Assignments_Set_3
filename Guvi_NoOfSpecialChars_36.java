import java.io.*;

class Guvi_NoOfSpecialChars_36
{
    public static void main(String args[])throws IOException
    { 

	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	
	String str;

	System.out.println("Enter the string");
	str=in.readLine();
		
	int i,j,l,c=0;
	char ch;
	
	l=str.length();

	
	for(i=0;i<l;i++)
	{
		ch=str.charAt(i);
	
		if(Character.isDigit(ch))
			continue;
		else if(ch>=65&&ch<=90)	
			continue;
		else if(ch>=97&&ch<=122)	
			continue;
		else 
			c++;
					
		
	}

	System.out.println("No. of special characters are "+c);

    } 
} 
