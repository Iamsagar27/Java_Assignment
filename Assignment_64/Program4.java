/*
4. Write Java program which accept String from user and display below pattern. 
Input :  Hello 
Output : 	H e l l o    	
			H e l l *   	
			H e l * *   
			H e * * *   
			H * * * *    
			H e * * *   
			H e l * *   
			H e l l *   
			H e l l 0
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Pattern(String str)
	{
		char arr[] = str.toCharArray();
		int iSize = arr.length;

		for(int i = arr.length-1; i >= 0 ; i--)
		{
			for(int j = 0 ; j <= i ; j++)
			{
				System.out.print(" "+arr[j]);
			}
			for(int k = iSize-1 ; k>i;k--)
			{
				System.out.print(" *");	
			}
			System.out.println();		
		}
		for(int i = 1; i <arr.length ; i++)
		{

			for(int j = 0 ;j <= i; j++ )
			{
				System.out.print(" "+arr[j]);
			}
			for(int k = iSize-1 ; k>i;k--)
			{
				System.out.print(" *");	
			}
			System.out.println();		
		}
	}
}

class Program4
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