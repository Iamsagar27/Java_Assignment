/*
5. Write java program which accept marks of N students from user and display class of each student. 
Less than 35 -  Fail 			Less than 50 -  Pass class 				Less than 60 -  Second class 
Less than 70 -  First class 	Greater than 70 -  First class with Distinction 
Input :  67.3  45.8  88.9  77.5  55.2 

Output : 	67.3  First class   
		 	45.8  Pass class   
		 	88.9  First class with Distinction   
		 	77.5  First class with Distinction   
		 	55.2  Second class
*/

import java.util.*;
import java.lang.*;

class MyArray 
{  
	public void Percentage(float Arr[])  
	{   
		for(int i = 0; i<Arr.length ; i++)
		{
			if(Arr[i] > 70 && Arr[i] <=100)
			{
				System.out.print("\nFirst class with Distinction  " + Arr[i]);
			}
			else if(Arr[i] > 60 && Arr[i] <=70)
			{
				System.out.print("\nFirst class  " + Arr[i]);
			}
			else if(Arr[i] > 50 && Arr[i] <=60)
			{
				System.out.print("\nSecond class  " + Arr[i]);
			}
			else if(Arr[i] > 35 && Arr[i] <=50)
			{
				System.out.print("\nPass class   "+ Arr[i]);
			}
			else if(Arr[i] > 0 && Arr[i] <=35)
			{
				System.out.print("\nFail  " + Arr[i]);
			}	
		}
		
	} 
}

class Program4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elemens in  array :\t");
		int iSize = sc.nextInt();

		float Arr[] = new float[iSize];

		System.out.print("Enter elemens in  array :\t");
		for(int  i = 0 ; i <Arr.length ; i++)
		{
			Arr[i] = sc.nextFloat();
		}

		MyArray aobj = new MyArray();

		aobj.Percentage(Arr);
	}
}
