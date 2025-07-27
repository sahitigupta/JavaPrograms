package arrays;

public class ElementSearch {
	public int linearSearch(int[] a,int num) //Time: O(n) Space: O(1)
	{
		int n=a.length,i;
		for(i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				return i;
			}
		}
		return -1;
	}
	static int binarySearch(int[] a,int num)
	{
		int n=a.length;
		int low=0;
		int high=n;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==num)
			{
				return mid;
			}
			else if(a[mid]<num)
			{
				low=mid+1;
			}
			else if(a[mid]>num)
			{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		int[] arr= {54,95,32,7,321,86};
		ElementSearch lsearch = new ElementSearch();
		System.out.println("Position:"+lsearch.linearSearch(arr,7));
		int[] arr2= {4,76,88,345,660,2341,8607};
		System.out.println("Position:"+binarySearch(arr2,4));
	}
}
