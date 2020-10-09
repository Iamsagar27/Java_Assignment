/*
2. Write a program which accept matrix and reverse the contents of each row. 
Input : 
		3 	2 	5 	9 	
		4 	3 	2 	2 	
		8 	4 	1 	9 
		3 	9 	7 	5

Output : 
		9 	5 	2 	3
		2 	2 	3 	4 
		9 	1 	4 	8 
		5 	7 	9 	3
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void ReverseRow(int Arr[][])
	{
		
		for (int i = 0;i<Arr.length ;i++ ) 
		{
			int iStart = 0 , iEnd = Arr.length-1 ;
			while(iStart < iEnd)
			{
				int temp = Arr[i][iStart];
				Arr[i][iStart] = Arr[i][iEnd];
				Arr[i][iEnd] = temp;

				iStart++;
				iEnd--;
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

class Program2
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

		mobj.ReverseRow(arr);
	}
}