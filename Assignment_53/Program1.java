/*
1. Write Java program which accept N numbers from user and return difference between summation of even elements 
and summation of odd elements. 

Input :  N :   6 
Elements : 85 66 3 80 93 88  
Output : 53 (234 - 181) 
*/


import java.util.*;
import java.lang.*;


class ArrayDemo 
{  
	public int Difference(int Arr[] , int iLength)  
	{   
		int iEven = 0 , iOdd = 0;
		int i = 0 ;

		for(i = 0 ; i < iLength ; i++)
		{
			if(Arr[i] % 2 == 0)
			{
				iEven = iEven + Arr[i];
			}
			else
			{
				iOdd = iOdd + Arr[i];
			}
		}
	  return (iEven - iOdd);
	} 
}


class Program1
{
	public static void main(String args[]) 
	{
		int ret = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements :\t");
		int iSize = sc.nextInt();

		System.out.print("The elements are:\n");
		int p[] = new int[iSize];

		for(int i = 0 ; i< iSize ; i++)
		{
			p[i] = sc.nextInt();
		}

		ArrayDemo aobj = new ArrayDemo();

		ret = aobj.Difference(p,iSize);

		System.out.print("Difference  between summation of even and odd : "+ret);

	}
}

