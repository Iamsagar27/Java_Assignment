/*
4. Write Java program which accept two arrays from user and form new array which is combination of contents 
of first and second array. 
Input :  12 57 28 3   		99 23 54 58 6 67 
Output : 12 57 28 3 99 23 54 58 6 67 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void ArrayConcate(int arr1[], int iSize1, int arr2[], int iSize2)  
	{   
		int iCnt = 0;
		// Allocate dynamic memory to store contents of both arrays
		int arr3[] = new int [iSize1 + iSize2];

		// Traverse Both the array and copy contents into new array  
		for( int i = 0 ; i <arr1.length ; i++)
		{
			arr3[i] = arr1[i];
			iCnt++;
		}

		for( int j = 0 ; j <arr2.length ; j++)
		{
			arr3[iCnt++] = arr2[j];
		}

		for( int i = 0 ; i <arr3.length ; i++)
		{
			System.out.print("  "+arr3[i]);
		}		
	}
}

class Program4
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

		aobj.ArrayConcate(Arr1,iSize1,Arr2,iSize2);
	}
}

