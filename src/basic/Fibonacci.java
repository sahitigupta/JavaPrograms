package basic;

import java.util.*;

//Time Complexity: O(2^N)   Auxiliary Space: O(n)
public class Fibonacci {
	static int fib(int n)
	{
		if(n<=1)
			return n;
		
		return fib(n-1)+fib(n-2);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=in.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.print(fib(i)+" ");
		}
		in.close();
	}
}

























