package arrays;

public class LargestElement {
	static int findLargestElement(int[] a) //time: O(n) space: O(1)
	{
		int n=a.length;
		int ele=a[0];
		int i;
		for(i=1;i<n;i++)
		{
			if(a[i]>ele)
			{
				ele=a[i];
			}
		}
		return ele;
	}
	public static void main(String args[])
	{
		int[] arr= {4,767,2,908,3447,9,0,3};
		System.out.println(findLargestElement(arr));
	}
}


