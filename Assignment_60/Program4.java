/*
4. Accept sing from user and reverse the contents of that string by toggling the case. 
Input :    aCBdef 
Output :   FEDcb
*/

import java.lang.*;
import java.util.*;

class StringDemo 
{  
	public void StrRevTog(String string)  
	{  
		char str[] = string.toCharArray(); 
		int iStart = 0 , iLast = 0;
		iLast = str.length-1;
		

		for(iStart = 0; iStart < iLast; iStart++, iLast--)
		{
			char temp = str[iStart];
			str[iStart] = str[iLast];
			str[iLast] = temp;
		}
		for (int i=0; i<str.length; i++) 
    	{ 
        	if (str[i]>='A' && str[i]<='Z') 
            {	
            	str[i] = (char) (str[i] + 'a' - 'A'); 
        	}
        	else if (str[i]>='a' && str[i]<='z') 
            {
            	str[i] = (char) (str[i] + 'A' - 'a');
        	}  
        }
         for (char c : str) 
        System.out.print(c); 
        System.out.println();
	} 
}

class Program4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the src string :\t");
		String str = sc.nextLine();

		StringDemo sobj = new StringDemo();

		sobj.StrRevTog(str);
	}
}

