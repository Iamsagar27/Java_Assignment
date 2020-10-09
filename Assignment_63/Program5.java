/*
5.Write a java program which accept matrix from user and return addition of border elements of matrix.
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public int SumofBorder(int Arr[][])
	{
		int iSum = 0;

		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{	
				if((i == 0) || (j == 0) || (i == Arr.length -1) || (j == Arr[i].length - 1))
				{
					iSum = iSum +Arr[i][j];
				}	
			}
		}
		return iSum;
	}

}

class Program5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows :\t");
		int rows = sc.nextInt();
		System.out.print("Enter the number of cols :\t");
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];

		System.out.println("Enter the elements :");
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println("Row with index :" + i);
			for(int j = 0 ; j<arr[i].length ; j++)
			{	
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("The number:");
		for(int i = 0 ; i<arr.length ; i++)
		{	
			for(int j = 0 ; j<arr[i].length ; j++)
			{	
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}

		Matrix mobj = new Matrix();

		int iRet = mobj.SumofBorder(arr);

		System.out.println("Sum of Border elements :"+iRet);
	}
}

