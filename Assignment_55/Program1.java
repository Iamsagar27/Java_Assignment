/*
1. Write java program which accept N numbers from user and accept one another number as NO , check whether 
NO is present or not. 
Input :  N :   6 
 NO:  66 
  Elements : 85 66 3 66 93 88  
Output : TRUE 

Input :  N :   6 
  NO:  12 
  Elements : 85 11 3 15 11 111  
Output : FALSE  
*/

import java.lang.*;
import java.util.*;

class Number 
{  
	boolean Check(int Arr[],int iLength, int iNo)  
	{  
		int iCnt = 0;

		for(int i = 0 ; i < iLength ; i++)
		{
			if(Arr[i] == iNo)
			{
				iCnt++;
			}
		}	

		if(iCnt > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
}

class Program1
{
	public static void main(String args[])
	{
		boolean ret = false;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of Elements :\n");
		int iSize = sc.nextInt();

		System.out.print("Enter the number :\n");
		int number = sc.nextInt();

		System.out.println("The Elements are :");
		int p[] = new int[iSize];	

		for(int i = 0 ; i < iSize ; i++)
		{
			p[i] = sc.nextInt();
		}	

		Number nobj = new Number();

		ret = nobj.Check(p,iSize,number);

		if(ret == true)
		{
			System.out.print("Number is present \n");
		}
		else
		{
			System.out.print("Number is not present \n");
		}
	}
}
