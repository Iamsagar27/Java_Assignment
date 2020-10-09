/*
2. Write java program which accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO. 
Input :  N :   6 
  NO:  66 
  Elements : 85 66 3 66 93 88  
Output : 1 

Input :  N :   6 
  NO:  12 
  Elements : 85 11 3 15 11 111  
Output : -1 
*/

import java.lang.*;
import java.util.*;

class Number 
{  
	int FirstOcc(int Arr[],int iLength, int iNo)  
	{  
		int iAns = 0;

		for(int i = 0 ; i < iLength ; i++)
		{
			if(Arr[i] == iNo)
			{
				iAns = i;
				break;
			}
			else
			{
				iAns = -1;
			}
		}	
		return iAns;
	} 
}

class Program2
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of Elements :\n");
		int iSize = sc.nextInt();

		System.out.print("Enter the number :\n");
		int number = sc.nextInt();

		System.out.println("The Elements are :");
		int p[] = new int[iSize];	

		for(int i = 0 ; i < iSize ; i++)
		{
			p[i] = sc.nextInt();
		}	

		Number nobj = new Number();

		ret = nobj.FirstOcc(p,iSize,number);

		System.out.print("First Occerence of number :\t"+ret);
	}
}
