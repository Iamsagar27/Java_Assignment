/*
2.Write a java program which accept matrix from user and swap the contents of each consecutive columns. 
*/

import java.lang.*;
import java.util.*;

class Matrix
{
	public void swap(int Arr[][] ,int col)
	{
        int[] add = new int[col];
        
        for(int i = 0;i < Arr.length;i++)
        {
           for(int j = 0;j < Arr[i].length-1;j++)
           {
           		if(j % 2 == 0)
                {    
                	add[j] = Arr[i][j];
                    Arr[i][j] = Arr[i][j+1];
                    Arr[i][j+1] = add[j];  
                }
            }
        }
        System.out.println("matrix after swap");
        for(int i = 0;i < Arr.length;i++)
        {
            for(int j = 0;j < Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
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

		mobj.swap(arr,cols);
	}
}

