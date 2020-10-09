/*
1. Write a java program which accepts 2 strings from user and concat N characters of second string after first
 string. Value of N should be accepted from user. Note : If third parameter is greater than the size of second 
string then concat whole string after first string. 

Input :   "Marvellous Infosystems"    
			"Logic Building"    
			5 
Output :  "Marvellous Infosystems Logic" 
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{  
	public void StrNCatX(String src, String dest, int iCnt)  
	{  
		int i =0,j = 0;

		if(iCnt>dest.length())
		{
			iCnt = dest.length();
		}
		char arr1[] = new char[((src.length())+(dest.length())+1)];

		while(i<(src.length()))
		{
			arr1[i]=src.charAt(i);
			i++;
		}
		i++;
		while(j<iCnt)
		{
			arr1[i]=dest.charAt(j);
			i++;
			j++;
		}

		System.out.print("String After concatination : \t");
		System.out.print(arr1);
	} 
}

class Program1
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

		sobj.StrNCatX(src,dest,cnt);

		
	}
}