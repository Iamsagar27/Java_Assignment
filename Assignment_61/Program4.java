/*
4. Write a program which accept matrix and display addition of elements From each column. 
Input : 
		
		3 	2 	5 	9 
		4 	3 	2 	2 
		8 	4 	1 	9 
		3 	9 	7 	5

Output : 18 18 15 25 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void AddColumn(int Arr[][])
	{
		int iSum = 0;

		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{	
				iSum = iSum +Arr[j][i];
			}
			System.out.println("Addition of col :"+iSum);
			iSum = 0;
		}
	}

}

class Program4
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

		mobj.AddColumn(arr);
	}
}