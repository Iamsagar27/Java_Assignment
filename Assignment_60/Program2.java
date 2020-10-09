/*
2.  Write a program which 2 strings from user and check whether contents of two strings are equal or not. 
Input :   	"Marvellous Infosystems"    
			"Marvellous Infosystems" 

Output :  	TRUE 
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{  
	public boolean StrCmpX(String src, String dest)  
	{  
		char str1[] = src.toCharArray();
		char str2[] =dest.toCharArray();

		int iCnt = 0;

		if(str1.length == str2.length)
		{
			for(int i = 0; i < str1.length ; i++)
			{
				if(str1[i] != str2[i])
				{
					iCnt++;
				}
			}
		}
		else
		{
			iCnt = 1;
		}

		if(iCnt > 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	} 
}

class Program2
{
	public static void main(String args[])
	{
	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the src string :\t");
		String src = sc.nextLine();

		System.out.print("Enter the dest string :\t");
		String dest = sc.nextLine();

		StringDemo sobj = new StringDemo();

		boolean bret = sobj.StrCmpX(src,dest);

		if(bret == true)
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");	
		}
	}
}