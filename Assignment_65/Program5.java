/*
5. Write a java program which accept number of rows and number of columns from user and display below pattern. 
Input :  iRow = 4  iCol =  4  
Output : 	1 2 3 4 5   
			1 2     5   
			1   3   5   
			1     4 5 
            1 2 3 4 5
*/

import java.lang.*;
import java.util.*;

class Pattern
{
	void Pattern(int iRow, int iCol) 
	{  
		if(iRow != iCol)
		{
			return;
		}
		if(iRow < 0 || iCol < 0)
		{
			iRow = -iRow;
			iCol = -iCol;
		}
	
	    for(int i = 1 ; i<=iRow ; i++)
	    {
	        for(int j = 1 ; j<=iCol ; j++)
	        {
	            if (( j==iCol || i==iRow) ||(i == 1 || j == 1) || (i == j) )
	            {
	                System.out.print("\t"+j);
	            }
	            else
	            {
	                System.out.print("\t");
	            }    
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
		System.out.print("Enter the rows :\t");
		int iRow = sc.nextInt();
		System.out.print("Enter the cols :\t");
		int iCol = sc.nextInt();

		Pattern pobj = new Pattern();

		pobj.Pattern(iRow,iCol);
	}
}

