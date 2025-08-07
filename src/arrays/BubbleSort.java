package arrays;
//t:O(n^2) s:O(1)
public class BubbleSort {
	void bubbleSortArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			boolean swap = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false)
				break;
		}
	}
	static void printArray(int[] arr)
    {
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
	public static void main(String args[])
	{
		int a[] = {3,56,367,3,2};
		BubbleSort ob = new BubbleSort();
		ob.bubbleSortArray(a);
		printArray(a);
	}
}
