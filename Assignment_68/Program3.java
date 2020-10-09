/*
4. Write java program which accept array of characters from user and count number of capital characters. 
Input :  b N j B R b A d G G  
Output : 6 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public int ArrayCapital(char Arr[])  
	{   
		int iCnt = 0;

		for(int i = 0; i<Arr.length ; i++)
		{
			if(Arr[i] >= 'A' && Arr[i] <= 'Z')
			{
				iCnt++;
			}
		}
		return iCnt;
	} 
}

class Program3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elemens in  array :\t");
		int iSize = sc.nextInt();

		char Arr[] = new char[iSize];

		System.out.print("Enter elemens in  array :\t");
		for(int  i = 0 ; i <Arr.length ; i++)
		{
			Arr[i] = sc.next().charAt(0);
		}

		MyArray aobj = new MyArray();

		int iRet = aobj.ArrayCapital(Arr);

		System.out.print("Number of capital character in array :\t"+iRet);
	}
}
