/*
2. Write a program which accept matrix and one number from user and return frequency of that number. 

Input : 
Number : 	9
			
			3	2	5	9 
			4	3	2	2 
			8	4 	1 	9 
			3 	9 	7 	5

Output : 	9 
*/

import java.lang.*;
import java.util.*;

class Matrix 
{
	int frequency(int Arr[][] , int iNo) 
	{
		int iCnt = 0;

		for(int i = 0 ; i<Arr.length ; i++)
		{
			for(int j = 0 ; j<Arr[i].length ; j++)
			{
				if(Arr[i][j] == iNo)
				{
					iCnt++;
				}	
				
			}	
		}
		return iCnt;
	}
}

class Program2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows :\t");
		int row = sc.nextInt();
		System.out.print("Enter the number of cols :\t");
		int col = sc.nextInt();

		System.out.print("Enter the number:\t");
		int num = sc.nextInt();


		int arr[][] = new int[row][col];

		System.out.println("Enter the elements :");
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println("Row with index :" + i);
			for(int j = 0 ; j<arr[i].length ; j++)
			{	
				arr[i][j] = sc.nextInt();
			}	
		}

		System.out.println("The elements :");
		for(int i = 0 ; i<arr.length ; i++)
		{
			for(int j = 0 ; j<arr[i].length ; j++)
			{	
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();	
		}

		Matrix mobj = new Matrix();

		int iRet = mobj.frequency(arr,num);

		System.out.println("Frequency of the number :"+iRet);

	}
}
