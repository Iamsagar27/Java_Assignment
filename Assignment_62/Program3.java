/*
3. Write a program which accept matrix and reverse the contents of each column. 
Input : 
		3 	2 	5 	9 	
		4 	3 	2 	2 
		8 	4 	1 	9 
		3 	9 	7 	5

Output :  
		3 	9 	7 	5 
		8 	4 	1 	9 
		4 	3 	2 	2 
		3 	2 	5 	9
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void ReverseCol(int Arr[][])
	{
		int rows = Arr.length;
		int cols = Arr[1].length;

		for (int i = 0 ; i<rows/2 ; i++ ) 
		{
			for(int j = 0 ; j< cols ; j++)
			{
				int temp = Arr[i][j];
				Arr[i][j] = Arr[rows - i - 1][j];
				 Arr[rows - i - 1][j] = temp;
			}		
		}

		System.out.println("Matrix after row reverse :");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{	
				System.out.print(" "+Arr[i][j]);	
			}
			System.out.println();
		}	
	}

}

class Program3
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

		mobj.ReverseCol(arr);
	}
}

