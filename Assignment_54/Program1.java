/*
1.Write a java program which accept number from user and return the count of even digits. 
Input :  2395  		Output :  1 
Input :  1018 		Output :  2 
Input :  -1018 		Output :  2 
Input :  8462 		Output :  4 
*/

import java.lang.*;
import java.util.*;

class Digit 
{  
	public int CountEven(int iNo)  
	{   
		int iCnt = 0;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			if((iNo %10) % 2 == 0)
			{
				iCnt++;
			}
			iNo /= 10;
		}
		return iCnt;
	} 
}


class Program1
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :\t");
		int number = sc.nextInt();

		Digit dobj = new Digit();

		ret = dobj.CountEven(number);

		System.out.println("\nCount of Number of even digit :\t"+ret); 
	}
}

