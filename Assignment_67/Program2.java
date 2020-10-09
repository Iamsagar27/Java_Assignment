/*
2. Write a java program which accept two two arrays from user and display minimum element of each array. 
Input :  2 9 7 5 2 3   		9 3 5 5 
Output : 2 					3 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void MinArray(int arr1[], int arr2[])  
	{   
		int iMin1 = arr1[1];
		int iMin2 = arr2[1];

		for(int  i = 0 ; i <arr1.length ; i++)
		{
			 if(arr1[i] < iMin1)
			 {
			 	iMin1 = arr1[i];
			 }	
		}

		for(int  i = 0 ; i <arr2.length ; i++)
		{
			if(arr2[i] < iMin2)
			 {
			 	iMin2 = arr2[i];
			 }
		}

		System.out.print("\nMinimum element of First array :\t"+iMin1);
		System.out.print("\nMinimum element of Second array :\t"+iMin2);
	} 
}

class Program2
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

		aobj.MinArray(Arr1,Arr2);	
	}
}


