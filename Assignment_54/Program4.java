/*
4.Write a program which accept number from user and return multiplication of all digits. 
Input :  2395  		Output :  270 
Input :  1018 		Output :  8 
Input :  9440 		Output :  144 
Input :  922432 	Output :  864
*/

import java.lang.*;
import java.util.*;

class Digit 
{  
	public int Multiply(int iNo)  
	{   
		int iMult = 1;

		if(iNo < 0)
		{
			iNo = -iNo;
		}

		while(iNo != 0)
		{
			iMult = iMult * (iNo % 10);
			iNo /= 10 ;
		}
		return iMult ;
	} 
}


class Program4
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number :\t");
		int number = sc.nextInt();

		Digit dobj = new Digit();

		ret = dobj.Multiply(number);

		System.out.println("\nMultiplication of digits :\t"+ret); 
	}
}

