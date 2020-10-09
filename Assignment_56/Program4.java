/*
4. Write a java program which accept string from user and check whether it contains vowels in it or not. 
Input :   marvellous 
Output :   TRUE 
Input :   Demo
Output :   TRUE 
Input :   xyz 
Output :   FALSE
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{
	boolean CheckVowel(String str)   
	{  
		int i = 0 , iCnt = 0;

		for(i = 0 ; i <str.length() ;i++)
		{
			char ch[] = str.toCharArray();
				
			if(ch[i] == 'A' || ch[i] <= 'E' || ch[i] <= 'I'|| ch[i] <= 'O'|| ch[i] <= 'U'||
				ch[i] == 'a' || ch[i] <= 'e' || ch[i] <= 'i'|| ch[i] <= 'o'|| ch[i] <= 'u')
			{
				iCnt++;
			}
		}

		if(iCnt > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
}

class Program4
{
	public static void main(String args[])
	{
		boolean bret = false;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the String :\n");
		String  str= sc.next();

		StringDemo sobj = new StringDemo();

		bret = sobj.CheckVowel(str);
		if(bret == true)
		{
			System.out.print("Vowel present");
		}
		else
		{
			System.out.print("Vowel not present");
		}
	}
}
