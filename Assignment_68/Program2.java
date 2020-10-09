/*
2. Write java program which accept array from user and replace each member with summation of its digit. 
Input :  89 687 56 549 87 9 
Output :  17 21 11 18 15 9
*/


import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void SumArray(int Arr[])  
	{   
		int iDigit = 0;
		int iSum = 0;
		int iNo = 0;
		for(int i = 0; i<Arr.length ; i++)
		{
			iNo = Arr[i];
        	iSum = 0;
			while(iNo !=0)
			{
				iDigit = iNo % 10;
				iSum = iSum + iDigit;
				iNo /= 10;
			}
			System.out.print("\nSum of element "+i+ "  :  "  +iSum);	
		}
		
	} 
}

class Program2
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

		aobj.SumArray(Arr);
	}
}

