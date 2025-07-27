package basic;

import java.util.*;

public class Factorial {
	static int fact(int n)
	{
		int res;
		if (n==0 | n==1)
		{
			return 1;
		}
		else
		{
			res=n*fact(n-1);
		}
		return res;
	}
	public static void main(String args[])
	{
		int num;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter number:");
		num=in.nextInt();
		System.out.println("Factorial of "+num+" is "+fact(num));
		in.close();
	}
}