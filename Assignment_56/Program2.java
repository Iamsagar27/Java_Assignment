/*
2. Write a java  program which accept string from user and count number of small characters. 
Input :   "Marvellous"
Output :   9 
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{
	public int CountSmall(String str)   
	{  
		int i = 0 , iCnt = 0 ;
		

		for(i = 0 ; i <str.length() ;i++)
		{
			char ch[] = str.toCharArray();
				
			if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				iCnt++;
			}
	
		}
		return iCnt;
	} 
}

class Program2
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the String :\n");
		String  str= sc.next();

		StringDemo sobj = new StringDemo();

		ret = sobj.CountSmall(str);

		System.out.print("Number of small letter :\n"+ret);

	}
}
