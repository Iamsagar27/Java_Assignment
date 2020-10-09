/*
1. Write Java program which accept array of characters from user and replace each capital character with 
its corresponding small character. 
Input :  b N j B R b A d G G  
Output : b n j b r b a d g g
*/


import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void ArrayReplace(char Arr[])  
	{   
		

		for(int i = 0; i<Arr.length ; i++)
		{
			if(Arr[i] >= 'A' && Arr[i] <= 'Z')
			{
				System.out.print(" "+(char)((int)Arr[i]+32));
			}
			else
			{
				System.out.print(" "+Arr[i]);
			}
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

		char Arr[] = new char[iSize];

		System.out.print("Enter elemens in  array :\t");
		for(int  i = 0 ; i <Arr.length ; i++)
		{
			Arr[i] = sc.next().charAt(0);
		}

		MyArray aobj = new MyArray();

		aobj.ArrayReplace(Arr);
	}
}
