package basic;

import java.util.*;

public class InputNumber {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = in.nextInt();
		System.out.println("Number entered:"+n);
		System.out.println("Enter string:");
		String str = in.next(); //one word
		//String str = in.nextLine(); //until new line
		System.out.println("String entered:"+str);
		//multi-line input
		in.close();
	}
}
