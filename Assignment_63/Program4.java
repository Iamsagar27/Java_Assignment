/*
4.Write a java program which accept matrix from user and trace and normal of given matrix.
Here trace of the matrix is the sum of the elements of the main diagonal i.e the diagonal from the 
upper left to the lower right of a matrix. Normal of the matrix is the square root of the sum of 
all the elements.
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void Trace(int Arr[][],int row,int col)
	{
        if(row != col)
        {
            return ;
        }
        int Sum = 0;
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                if(i == j)
                {
                    Sum = Sum + Arr[i][j]; 
                }
            }
        }
        System.out.println("Trace of matrix"+Sum);
    }

    public void Normal(int Arr[][] )
    {
        int Sum = 0;
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                Sum = Sum + Arr[i][j];  
            }
        }
        System.out.println("Normal of Matrix"+Math.sqrt(Sum));
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

		mobj.Trace(arr,rows,cols);
		mobj.Normal(arr);
	}
}

