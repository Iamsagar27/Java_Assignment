/*
1. Write Java program which accept String from user and display below pattern. 
Input :  Hello 
Output : 	H e l l o    
			H e l l o    
			H e l l o    
			H e l l o 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char arr[] = str.toCharArray();
		int iSize = arr.length;

		while(iSize >0)
		{
			for(int i = 0; i<arr.length ; i++)
			{
				System.out.print(" "+arr[i]);		
			}
			iSize--;
			System.out.println();		
		}
	}
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :\t");
		String str = sc.nextLine();

		Pattern pobj = new Pattern();

		pobj.Pattern(str);
	}
}