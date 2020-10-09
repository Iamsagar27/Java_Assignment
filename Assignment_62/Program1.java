/*
1.Write a program which accept matrix from user and display transpose of the matrix. 
The transpose of a given matrix is formed by interchanging the rows and columns of a matrix. 
Input : 
		
		3 	2 	5 	9 
		4 	3 	2 	2 
		8 	4 	1 	5 
		3 	9	7 	5

Output : 

		3 	4 	8 	3 
		2 	3 	4 	9 
		5 	2 	1 	7 
		9 	2 	5 	5

*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void Transpose(int Arr[][])
	{
		System.out.println("Matrix after transpose :");
		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{	
				System.out.print(" "+Arr[j][i]);	
			}
			System.out.println();
		}
	}

}

class Program1
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

		mobj.Transpose(arr);
	}
}