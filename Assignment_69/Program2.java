/*
2. Write Java program which accept array of characters from user and replace each capital character with its corresponding small character. 
Input :  b N e B R b A i G i  
Output : 4 
*/


import java.util.*;
import java.lang.*;

class MyArray 
{  
	public int ArrayCountVowel(char Arr[])  
	{   
		int iCnt = 0;

		for(int i = 0; i<Arr.length ; i++)
		{
			if((Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U') 
			|| (Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u'))
			{
				iCnt++;
			}
		}
		return iCnt;
	} 
}

class Program2
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

		int iRet = aobj.ArrayCountVowel(Arr);
	
		System.out.println("Count of vowel in array  :" + iRet);
	}
}
