/*
5. Write Java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 3  iCol =  4  
Output : 	1 2 3 4   
			5 6 7 8   
			9 10 11 12
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	public void Pattern(int iRow , int iCol)
	{
		int iCnt = 1;

		for(int i = 1 ; i<=iRow ; i++)
		{
				
			for(int j  = 1 ; j <=iCol ; j++)
			{
				System.out.print(" "+iCnt);
				iCnt++;
			}
			
			System.out.println();
		}

	}
}


class Program5
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