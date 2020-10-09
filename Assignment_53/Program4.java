/*
4. Write Java program which accept N numbers from user and display all such elements which are divisible by 3 and 5. 
Input :  N :   6 
 Elements : 85 66 3 15 93 88  
Output : 15 
*/

import java.util.*;
import java.lang.*;


class ArrayDemo 
{  
	public void Display(int Arr[] , int iLength)
	{
		System.out.print("Numbers divisible by 3 and 5  :\n ");
		for(int i = 0 ; i < iLength ; i++)
		{
			if((Arr[i] % 3 == 0) && (Arr[i] % 5 == 0))
			{
				System.out.print("   "+Arr[i]);
			}
		}
	}
}


class Program4
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


