/*
5. Write a java program which accept string from user and display it in reverse order. 
Input :   MarvellouS 
Output :   SuollevraM
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{
	public void Reverse(String str)   
	{  
		int iStart = 0 , iEnd = 0;
		char temp = '\0';
		char ch[] = str.toCharArray();

		for(int i = ch.length-1 ; i>=0 ; i--)
		{
			System.out.print(ch[i]);
		}
	} 
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the String :\n");
		String  str= sc.next();

		StringDemo sobj = new StringDemo();

		sobj.Reverse(str);		
	}
}