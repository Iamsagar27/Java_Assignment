/*
5. Write a java program which accept two array from user and check whether that array and its elements are 
palindrome or not. 
Input :   11 252 387 783 252 11 
Output :   TRUE 
Input :   11 252 387783 77 11 
Output :   FALSE 
Input :   11 252 786 252 11 
Output :   FALSE 
Input :   11 252 786 253 11 
Output :   FALSE 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public boolean ChkPalindrome(int arr[])  
	{   
		int i = 0 , iCnt = 0;
		int iSize = arr.length;

		System.out.print("Elements in array :\t");
		for(i = 0 ; i < iSize ;i++)
 		{
 			System.out.print("  "+arr[i]);
 		}

		int j = 0;
		int arr1[] = new int[iSize];

		System.out.print("\nElemens after reverse :\t");
 		for(i = iSize; i >0 ; i--,j++)
 		{
 			arr1[j] = arr[i-1];
 			System.out.print("  "+arr1[j]);
 		}

 		for(i = 0,j = 0 ; i < iSize && j < arr1.length-i ;i++,j++)
 		{
	 		if(arr[i] == arr1[j])
	 		{
	 			iCnt++;
	 		} 		
		}
		if(iCnt == iSize)
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
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elemens in  array :\t");
		int iSize = sc.nextInt();

		int Arr[] = new int[iSize];

		System.out.print("Enter elemens in array :\t");
		for(int  i = 0 ; i <Arr.length ; i++)
		{
			Arr[i] = sc.nextInt();
		}

		MyArray aobj = new MyArray();

		boolean bret = aobj.ChkPalindrome(Arr);	
	
		if(bret == true)
		{
			System.out.print("Array is palindrome");
		}
		else
		{
			System.out.print("Array is not palindrome");
		}

	}
}