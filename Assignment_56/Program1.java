/*
1.Write a Java program which accept string from user and count number of capital characters. 
Input :   "Marvellous Multi OS"
Output :   4 
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{
	public int CountCapital(String str)   
	{  
		int i = 0 , iCnt = 0 ;
		

		for(i = 0 ; i <str.length() ;i++)
		{
			char ch[] = str.toCharArray();
				
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				iCnt++;
			}
	
		}
		return iCnt;
	} 
}

class Program1
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
