/*
3. Write a java program which accept two array from user and copy the contents of that array into another 
array in reverse order and return new array. 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void CopyArrayRev (int arr[],int iSize)  
	{   
		int j = 0;
		int arr1[] = new int[iSize];

		System.out.print("Array after reverse :\t");
 		for(int i = iSize ; i >0 ; i--,j++)
 		{
 			arr1[j] = arr[i-1];
 			System.out.print("  "+arr1[j]);
 		}
	} 
}

class Program3
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

		aobj.CopyArrayRev(Arr,iSize);	
	}
}


