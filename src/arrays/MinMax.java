package arrays;

import java.util.Scanner;

public class MinMax {
	void findMinMax(int arr[], int n)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i=0;i<n;i++)
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
			else if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Minimum value:"+min+" Maximum value:"+max);
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = in.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array:");
		for (int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		MinMax ob = new MinMax();
		ob.findMinMax(a,n);
		in.close();
	}
}
