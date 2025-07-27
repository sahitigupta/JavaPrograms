package arrays;

public class ElementSort {
	static void bubbleSortElement(int a[]) //Time: O(O^2) Space: O(1)
	{
		int n=a.length;
		int temp,i,j;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		arrays.CRUD.traverseArray(a);
	}
	static void selectionSortElement(int a[]) //Time:O(n^2) Space: O(1)
	{
		int n=a.length;
		int min_ele,i,j;
		for(i=0;i<n-1;i++)
		{
			min_ele=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[min_ele])
				{
					min_ele=j;
				}
			}
			int temp=a[min_ele];
			a[min_ele]=a[i];
			a[i]=temp;
		}
		arrays.CRUD.traverseArray(a);
	}
	static void insertionSortElement(int[] a) //Time:O(n^2) Space: O(1)
	{
		int n=a.length;
		int i,j,current;
		for(i=1;i<n;i++)
		{
			current=a[i];
			j=i-1;
			while(j>=0&&current<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
		arrays.CRUD.traverseArray(a);
	}
	static void quickSortElement(int a[])
	{
		
	}
	static void mergeSortElement(int a[])
	{
		
	}
	public static void main(String args[])
	{
		int[] arr= {54,95,32,47,32,86};
		//bubbleSortElement(arr);
		//selectionSortElement(arr);
		insertionSortElement(arr);
		quickSortElement(arr);
		mergeSortElement(arr);
	}
}
