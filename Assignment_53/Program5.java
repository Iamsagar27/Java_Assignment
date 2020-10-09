/*
5. Write Java program which accept N numbers from user and display all such elements which are multiples of 11. 
Input :  N :   6 
 Elements : 85 66 3 55 93 88  
Output : 66 55 88 
*/

import java.util.*;
import java.lang.*;


class ArrayDemo 
{  
	public void Display(int Arr[] , int iLength)
	{
		System.out.print("Numbers multiples of 11  :\n ");
		for(int i = 0 ; i < iLength ; i++)
		{
			if(Arr[i] % 11 == 0)
			{
				System.out.print("   "+Arr[i]);
			}
		}
	}
}


class Program5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements :\t");
		int iSize = sc.nextInt();

		System.out.print("The elements are :\n");
		int p[] = new int[iSize];

		for(int i = 0 ; i < iSize ; i++)
		{
			p[i]= sc.nextInt();
		}		

		ArrayDemo aobj = new ArrayDemo();

		aobj.Display(p,iSize);

	}
}

