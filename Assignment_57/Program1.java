/*
1. Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol = 4  
Output : 	A B C D   
			A B C D   
			A B C D   
			A B C D 
*/


import java.lang.*;
import java.util.*;

class Pattern
{
	public void Pattern(int iRow , int iCol)
	{
		char ch = 'A';

		for(int i = 1 ; i <=iRow ; i++)
		{
			ch = 'A';
			for(int j  = 1 ; j <=iCol ; j++)
			{
				System.out.print(" "+ch);
				ch++;
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
		System.out.print("Enter number of rows :\t");
		int rows = sc.nextInt();
		System.out.print("Enter number of cols :\t");
		int cols = sc.nextInt();

		Pattern pobj = new Pattern();

		pobj.Pattern(rows,cols);
	}
}

