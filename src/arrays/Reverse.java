package arrays;

public class Reverse {
	int[] arrReverse(int arr[])   //Time: O(n) Space: O(1)
	{
		int temp;
		int mid = arr.length / 2;
		int j=arr.length-1;
		for (int i=0;i<mid;i++,j--)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}
	public static void main(String args[])
	{
		//int a1[] = {1,43,56,3,278,0};
		int a2[] = {98,56,4,37,45};
		Reverse ob = new Reverse();
		int res[] = ob.arrReverse(a2);
		for (int i=0;i<a2.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
}
