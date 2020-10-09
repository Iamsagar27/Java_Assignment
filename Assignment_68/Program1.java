/*
1. Write java program which accept array from user and reverse each number of that array. 
Input :  89 687 56 549 87 9 
Output :  98 786 65 945 78 9 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void ReverseArray(int Arr[])  
	{   
		int iDigit = 0;
		int iRev = 0;
		int iNo = 0;
		for(int i = 0; i<Arr.length ; i++)
		{
			iNo = Arr[i];
        	iRev = 0;
			while(iNo !=0)
			{
				iDigit = iNo % 10;
				iRev = (iRev * 10) + iDigit;
				iNo /= 10;
			}
			System.out.print("\nReverse of element "+i+ "  :  "  +iRev);	
		}
		
	} 
}

class Program1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elemens in  array :\t");
		int iSize = sc.nextInt();

		int Arr[] = new int[iSize];

		System.out.print("Enter elemens in  array :\t");
		for(int  i = 0 ; i <Arr.length ; i++)
		{
			Arr[i] = sc.nextInt();
		}

		MyArray aobj = new MyArray();

		aobj.ReverseArray(Arr);
	}
}


