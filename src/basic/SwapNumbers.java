package basic;

import java.util.Scanner;

public class SwapNumbers {
	void numberSwap(int a, int b)
	{
		//using temp variable - extra memory
		//int temp;
	/*	temp=a;
		a=b;
		b=temp;
	*/	
		//without third variable
	/*	a=a-b;
		b=a+b;
		a=b-a;
	*/	
		//using binary operator ^ - xor
	/*	a=a^b;
		b=a^b;
		a=a^b;
	*/	
		//arithmetic expression
		a = (a + b) - (b = a);
		
		System.out.println("1st number="+a+" 2nd number="+b);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		SwapNumbers ob=new SwapNumbers();
		ob.numberSwap(a,b);
		in.close();
	}
}
