/*
5. Write Java program which accept two arrays from user and display summation of each array. 
Input :  2 9 7 5 2 3   		9 3 5 5 
Output : 28 				22
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void SumArray(int arr1[], int arr2[])  
	{   
		int iSum1 = 0;
		int iSum2 = 0;

		for(int  i = 0 ; i <arr1.length ; i++)
		{
			iSum1 = iSum1 + arr1[i];	
		}

		for(int  i = 0 ; i <arr2.length ; i++)
		{
			iSum2 = iSum2 + arr2[i];
		}
		System.out.print("\nSummation of First array :\t"+iSum1);
		System.out.print("\nSummation of Second array :\t"+iSum2);
	} 
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elemens in first array :\t");
		int iSize1 = sc.nextInt();

		System.out.print("How many elemens in second array :\t");
		int iSize2 = sc.nextInt();

		int Arr1[] = new int[iSize1];

		int Arr2[] = new int[iSize2];

		System.out.print("Enter elemens in first array :\t");
		for(int  i = 0 ; i <Arr1.length ; i++)
		{
			Arr1[i] = sc.nextInt();
		}

		System.out.print("Enter elemens in second array :\t");
		for(int  i = 0 ; i <Arr2.length ; i++)
		{
			Arr2[i] = sc.nextInt();
		}

		MyArray aobj = new MyArray();

		aobj.SumArray(Arr1,Arr2);
	}
}

