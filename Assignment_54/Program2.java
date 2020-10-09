/*
2.Write a program which accept number from user and return the count of odd digits. 
Input :  2395  		Output :  3 
Input :  1018 		Output :  2 
Input :  -1018 		Output :  2 
Input :  8462 		Output :  0
*/

import java.lang.*;
import java.util.*;

class Digit 
{  
	public int CountOdd(int iNo)  
	{   
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			if((iNo %10) % 2 != 0)
			{
				iCnt++;
			}
			iNo /= 10;
		}
		return iCnt;
	} 
}


class Program2
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :\t");
		int number = sc.nextInt();

		Digit dobj = new Digit();

		ret = dobj.CountOdd(number);

		System.out.println("\nCount of Number of odd digit :\t"+ret); 
	}
}

