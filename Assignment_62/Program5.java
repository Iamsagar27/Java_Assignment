/*
5. /Write a program which accept matrix and check whether the matrix is Sparse matrix or not. 
Sparse matrix is a matrix with the majority of its elements equal to zero. 
Input : 
		1 	0 	3 	0 
		0 	6 	0 	0 
		0 	0 	1 	0 	
		9 	0 	0 	9

Output : True 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public boolean SparseMatrix(int Arr[][])
	{
		int iCnt = 0;
		int i = 0 , j = 0 ;

		for(i = 0 ; i<Arr.length ; i++)
		{
			for(j = 0 ; j<Arr[i].length ; j++)
			{	
				if(Arr[i][j] == 0 )
				{
					iCnt++;
				}			
			}
		}
		if((i*j)/2 < iCnt)
		{
			return true;
		}
		else
		{
			return false;
		}
		
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

		boolean bRet = mobj.SparseMatrix(arr);

		if(bRet == true)
		{
			System.out.println("The matrix is a Sparse matrix");
		}
		else
		{
			System.out.println("The matrix is not a Sparse matrix");
		}
	}
}