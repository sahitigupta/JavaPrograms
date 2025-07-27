package arrays;

public class PeakElement {
	static int findPeakElement(int[] a)
	{
		int n=a.length;
		int i;
		for(i=1;i<n;i++)
		{
			if(a[i]>=a[i-1]&&a[i]>a[i+1])
			{
				return a[i];
			}
		}
		return 0;
	}
	public static void main(String [] args)
	{
		int[] arr= {58,53,36,44,23,84};
		System.out.println(findPeakElement(arr));
	}
}
