package arrays;

public class CRUD {
	static void traverseArray(int[] a)
	{
		//int n=a.length;
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	public void addElement(int[] a,int pos,int num)
	{
		int n=a.length;
		int i;
		int[] new_a=new int [n+1];
		for (i=0;i<=n;i++)
		{
			if(i<pos-1)
			{
				new_a[i]=a[i];
			}
			else if(i==pos-1)
			{
				new_a[i]=num;
			}
			else
			{
				new_a[i]=a[i-1];
			}
		}
		traverseArray(new_a);
	}
	static void updateElement(int[] a, int pos, int num)
	{
		int n=a.length;
		int i;
		for(i=0;i<n;i++)
		{
			if(i==pos-1)
			{
				a[i]=num;
			}
		}
		traverseArray(a);
	}
	static void deleteElement(int[] a, int pos)
	{
		int[] new_a=new int[a.length-1];
		int i,k=0;
		for (i=0;i<a.length;i++)
		{
			if(i==pos-1)
			{
				continue;
			}
			new_a[k]=a[i];
			k++;
		}
		traverseArray(new_a);
	}
	public static void main(String[] args)
	{
		int[] arr= {6,346,2,76,5,9};
		//traverseArray(arr);
		CRUD add_ele=new CRUD();
		add_ele.addElement(arr, 4, 869);
		//updateElement(arr,3,54);
		//deleteElement(arr,3);
	}
}
