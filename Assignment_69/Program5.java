/*
5. Write Java program which accept array from user and display below pattern. 
Input :  8 9 7 6 4 2 4 
Output :   	
			* * * * * * * *
			* * * * * * * *	*
			* * * * * * *    
			* * * * * *   
			* * * *   
			* *   
			* * * * 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void Pattern(int Arr[])  
	{   
		for(int  i = 0; i<Arr.length ; i++)
		{
			int j = Arr[i];
			for(int  z = 0; z<j; z++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}
	} 
}

class Program5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements :\t");
		int iSize = sc.nextInt();

		int Arr[] = new int[iSize];

		for(int i = 0 ; i<Arr.length ; i++)
		{
			Arr[i] = sc.nextInt();
		}

		MyArray aobj = new MyArray();

		aobj.Pattern(Arr);
	}
}

