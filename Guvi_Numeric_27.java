import java.io.*;
import java.util.Scanner;

class Guvi_Numeric_27
{
    public static void main(String args[])
    { 
 
        Scanner sc=new Scanner(System.in);
		
	String str;

	System.out.println("Enter the string");
	str=sc.next();
		
	int i,j,f=1,l,s=0;
	char ch;
	
	l=str.length();

	
	for(i=0;i<l;i++)
	{
		ch=str.charAt(i);
	
		if((ch=='-')||(ch=='+'))
			s++;	
		
	
		if(Character.isDigit(ch))
			continue;
		
		else if(ch=='.')
			f++;
		
		else
			f=0;
		
	}

	if((s==1)||(f==1)||(f==2))
		System.out.println("Its a digit");
	
	else
		System.out.println("Its not a digit");

    } 
} 
