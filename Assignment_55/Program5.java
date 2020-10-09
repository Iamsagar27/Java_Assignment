/*
5. Write java program which accept N numbers from user and return product of all odd elements. 
Input :  N :   6     
  Elements : 15 66 3 70 10 88  
    Output : 45 
Input :  N :   6     
  Elements : 44 66 72 70 10 88  
    Output : 0 
*/

import java.lang.*;
import java.util.*;

class Number 
{  
	int Product(int Arr[],int iLength)  
	{  
		int iProduct = 1;

		for(int i = 0 ; i < iLength ; i++)
		{
			if(Arr[i] % 2 != 0)
			{
				iProduct = iProduct * Arr[i];
			}
			else
			{
				iProduct = 0;
			}
		}	
		return iProduct;
	} 
}

class Program5
{
	public static void main(String args[])
	{
		int ret = 0;

		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of Elements :\n");
		int iSize = sc.nextInt();

		System.out.println("The Elements are :");
		int p[] = new int[iSize];	

		for(int i = 0 ; i < iSize ; i++)
		{
			p[i] = sc.nextInt();
		}	

		Number nobj = new Number();

		ret = nobj.Product(p,iSize);

		System.out.print("Product of numbers :\t"+ret);
	}
}
