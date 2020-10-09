/*
1.Write a program which accept matrix from user and return addition of diagonal elements. 

Input :		3	2	5	9
			4	3	2	2
			8	4	1	5
			3	9	7	5 

Output : 12 
*/

import java.lang.*;
import java.util.*;

class Matrix 
{
	int AddDiagonal(int Arr[][]) 
	{
		int iSum = 0;

		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{
				if( i == j)
				{
					iSum = iSum + Arr[i][j];
				}	
				
			}	
		}
		return iSum;
	}
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows :\t");
		int row = sc.nextInt();
		System.out.print("Enter the number of cols :\t");
		int col = sc.nextInt();


		int arr[][] = new int[row][col];

		System.out.println("Enter the elements :");
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println("Row with index :" + i);
			for(int j = 0 ; j<arr[i].length ; j++)
			{
				arr[i][j] = sc.nextInt();
			}	
		}

		System.out.println("The elements :");
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{	
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();	
		}

		Matrix mobj = new Matrix();

		int iRet = mobj.AddDiagonal(arr);

		System.out.println("Addition of diagonal elements :"+iRet);

	}
}
