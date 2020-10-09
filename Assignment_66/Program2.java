/*
2. Write Java program which accept two arrays from user and display even contents of each array. 
Input :  2 9 6 5 2 3   		45 6 12 18 23 4
 
Output :  2 6 2    			6 12 18 4
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void Display(int arr1[], int arr2[])  
	{   
		System.out.print("Elemens in first array :\t");
		for(int  i = 0 ; i <arr1.length ; i++)
		{
			if(arr1[i] % 2 == 0)
			{
				System.out.print(" "+arr1[i]);
			}
		}

		System.out.print("\nElemens in second array :\t");
		for(int  i = 0 ; i <arr2.length ; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.print(" "+arr2[i]);
			}
		}
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

		aobj.Display(Arr1,Arr2);
	}
}
