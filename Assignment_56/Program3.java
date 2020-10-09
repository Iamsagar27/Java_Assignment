/*
3. Write a java program which accept string from user and return difference between frequency of small characters and frequency of capital characters. 
Input :   "MarvellouS" 
Output :   6 (8-2)
*/


import java.lang.*;
import java.util.*;

class StringDemo 
{
	public int CountCapital(String str)   
	{  
		int i = 0 , iUpper = 0 , iLower = 0;
		int iAns = 0;

		for(i = 0 ; i <str.length() ;i++)
		{
			char ch[] = str.toCharArray();
				
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				iUpper++;
			}
			else if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				iLower++;
			}
	
		}
		return (iLower - iUpper);
	} 
}

class Program3
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the String :\n");
		String  str= sc.next();

		StringDemo sobj = new StringDemo();

		ret = sobj.CountCapital(str);

		System.out.print("Number of capital letter :\n"+ret);

	}
}
