/*
5. Accept string from user and check whether the string is palindrome or not without considering its case.   
Input :   1abccBA1 
Output :   TRUE 
*/

import java.lang.*;
import java.util.*;

class StringDemo
{
	public boolean Palindrome(String str)
	{
		char arr[] = str.toCharArray();
		int i = 0,j = ((arr.length)-1);

		while(i<=j)
		{
			if((arr[i]==arr[j]) || (arr[i]==(arr[j]+32)) || (arr[i]==(arr[j]-32)))
			{
				i++;
				j--;
				continue;
			}
			else
			{
				break;
			}

			
		}

		if(i>j)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Program5
{
	public static void main(java.lang.String args[])
	{
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the src string :\t");
		String src = sc.nextLine();

		StringDemo sobj = new StringDemo();

		if(sobj.Palindrome(src))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
 
		
	}
}
