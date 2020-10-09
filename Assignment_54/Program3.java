/*
3.Write a program which accept number from user and return the count of digits in between 3 and 7. 
Input :  2395  		Output :  1 
Input :  1018 		Output :  0 
Input :  4521 		Output :  2 
Input :  9922 		Output :  0
*/

import java.lang.*;
import java.util.*;

class Digit 
{  
	public int CountRange(int iNo)  
	{   
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			if(((iNo %10) > 3) && ((iNo %10) < 7))
			{
				iCnt++;
			}
			iNo /= 10;
		}
		return iCnt;
	} 
}


class Program3
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :\t");
		int number = sc.nextInt();

		Digit dobj = new Digit();

		ret = dobj.CountRange(number);

		System.out.println("\nCount of Number between range  :\t"+ret); 
	}
}
