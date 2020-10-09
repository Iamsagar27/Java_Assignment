/*
4. Write java program which accept N numbers from user and accept Range, Display all elements from that range 
Input :  N :   6 
  Start: 60     End :  90     Elements : 85 66 3 76 93 88  
Output : 66 76 88 
Input :  N :   6 
  Start: 30     End :  50     Elements : 85 66 3 76 93 88  
Output :  
*/

import java.lang.*;
import java.util.*;

class Number 
{  
	public void Display(int Arr[],int iLength,int iStart , int iEnd)  
	{  
		int iAns = 0;

		for(int i = 0 ; i < iLength ; i++)
		{
			if((Arr[i] > iStart) && (Arr[i] < iEnd))
			{
				System.out.print("  "+Arr[i]);
			}
		}
	} 
}

class Program4
{
	public static void main(String args[])
	{
	
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of Elements :\n");
		int iSize = sc.nextInt();

		System.out.print("Enter the start :\n");
		int iStart = sc.nextInt();

		System.out.print("Enter the end :\n");
		int iEnd = sc.nextInt();

		System.out.println("The Elements are :");
		int p[] = new int[iSize];	

		for(int i = 0 ; i < iSize ; i++)
		{
			p[i] = sc.nextInt();
		}	

		Number nobj = new Number();

		nobj.Display(p,iSize,iStart,iEnd);
	
	}
}