/*
3. Write Java program which accept array of characters from user and accept one character. 
Return occurrence of that character without considering case. 
Input :  b N e B R b A i G i B   b 
Output : 4 
*/


import java.util.*;
import java.lang.*;

class MyArray 
{  
	public int Occurence(char Arr[] , char ch)  
	{   
		int i = 0;

		for( i = 0; i<Arr.length ; i++)
		{
			if((Arr[i] == ch))
			{
				break;
			}
		}
		return i;
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

		System.out.print("How many elemens in  array :\t");
		char ch = sc.next().charAt(0);


		MyArray aobj = new MyArray();

		int iRet = aobj.Occurence(Arr , ch);
	
		System.out.println("Occurence of the character in array  :" + iRet);
	}
}

