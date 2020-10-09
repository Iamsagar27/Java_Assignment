/*
3. Write a program which 2 strings from user and check whether first N contents of two strings are equal or not. 
Note : If third parameter is greater than the size of second string then concat whole string after first string. 
Input :   Marvellous Infosystems     Marvellous Logic Building    10 
Output :  TRUE 
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{  
	public boolean StrNCmpX(String src, String dest , int iCnt)  
	{  
		int str1len = src.length();
		int str2len = dest.length();

		char[] arr1 = src.toCharArray();
		char[] arr2 = dest.toCharArray();

		if(str2len > iCnt)
		{
			int i = 0;
			for(i = 0;i < iCnt;i++)
			{
				if(arr1[i] != arr2[i])
				{
					break;
				}
			}
			if(i == iCnt)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			int i = 0;
			for(i = 0;i < str2len;i++)
			{
				if(arr1[i] != arr2[i])
				{
					break;
				}
			}
			if(i == str2len)
			{
				return true;
			}
			else
			{
				return false;
			}			
		}
	} 
}

class Program3
{
	public static void main(String args[])
	{
	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the src string :\t");
		String src = sc.nextLine();

		System.out.print("Enter the dest string :\t");
		String dest = sc.nextLine();

		System.out.print("Enter the length :\t");
		int cnt = sc.nextInt();	

		StringDemo sobj = new StringDemo();

		boolean bret = sobj.StrNCmpX(src,dest,cnt);

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