/*
4. Write Java program which accept array of characters from user and return difference between frequency of 
capital and frequency of small characters. 
Input :  b N e B R b A I O G i  
Output : 3 (7 - 4) 
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public int Difference(char Arr[])  
	{   
		int CapCnt = 0;
		int SmCnt = 0;

		for(int i = 0; i<Arr.length ; i++)
		{
			if(Arr[i] >= 'A' && Arr[i] <= 'Z')
			{
				CapCnt++;
			}
			else if(Arr[i] >= 'a' && Arr[i] <= 'z')
			{
				SmCnt++;
			}
		}
		return (CapCnt - SmCnt);
	} 
}

class Program4
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

		int iRet = aobj.Difference(Arr);
	
		System.out.println("Difference between frequency of capital and frequency of small characters.  :" + iRet);
	}
}
