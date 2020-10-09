/*
4. Write a java program which accept two array from user and copy the contents of that array into another 
array and return new array. 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void CopyArray(int arr[],int iSize)  
	{   
		

		System.out.print("Array after copy :\t");
 		for(int i = 0 ; i < iSize ;i++)
 		{
 			System.out.print("  "+arr[i]);
 		}
	} 
}

class Program4
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

		aobj.CopyArray(Arr,iSize);	
	}
}