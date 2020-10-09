/*
4. Write a program which accept matrix and check whether the matrix is identity matrix or not. 
Identity matrix is a square matrix with 1’s along the diagonal from upper left to lower right and 0’s in all 
other positions.  If it satisfies the structure as explained before then the matrix is called as identity matrix. 

Input : 
		1 	0 	0 	0 
		0 	1 	0 	0 
		0 	0 	1 	0 
		0 	0 	0 	1

Output : True 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public boolean Identity(int Arr[][])
	{
		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{	
				if(i==j && Arr[i][j] == 0 )
				{
					return false;
				}
				else if(i!=j && Arr[i][j] !=0 )
				{
					return false;
				}			
			}

		}
		return true;
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

		boolean bRet = mobj.Identity(arr);

		if(bRet == true)
		{
			System.out.println("The matrix is an identity matrix");
		}
		else
		{
			System.out.println("The matrix is not an identity matrix");
		}
	}
}