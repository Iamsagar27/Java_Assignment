/*
5.Write a program which accept number from user and return difference between summation of even digits and 
summation of odd digits. 
Input :  2395  		Output :  -15 (2 - 17) 
Input :  1018 		Output :  6 (8 - 2) 
Input :  8440 		Output :  16  (16 - 0) 
Input :  5733 		Output :  -18 (0 - 18) 
*/

import java.lang.*;
import java.util.*;

class Digit 
{  
	public int CountDiff(int iNo)  
	{   
		int iEven = 0 , iOdd = 0 ;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			if((iNo % 10) % 2 == 0)
			{
				iEven = iEven + (iNo % 10);
			}
			else
			{
				iOdd = iOdd + (iNo % 10);
			}
			iNo /= 10;		
		}
		return (iEven - iOdd) ;
	} 
}


class Program5
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :\t");
		int number = sc.nextInt();

		Digit dobj = new Digit();

		ret = dobj.CountDiff(number);

		System.out.println("\n Difference between summation of even digits and summation of odd digits.  :\t"+ret); 
	}
}
