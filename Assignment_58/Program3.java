/*
3. Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol = 5  
Output : 	5 4 3 2 1   
			5 4 3 2 1   
			5 4 3 2 1 
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Pattern(int iRow , int iCol)
	{
		for(int i = 1 ; i <=iRow ; i++)
		{
			for(int j  = iCol ; j >0 ; j--)
			{
				System.out.print(" "+j);
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
		System.out.print("Enter number of rows :\t");
		int rows = sc.nextInt();
		System.out.print("Enter number of cols :\t");
		int cols = sc.nextInt();

		Pattern pobj = new Pattern();

		pobj.Pattern(rows,cols);
	}
}