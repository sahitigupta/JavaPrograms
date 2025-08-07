package arrays;
//t:O(n^2) s:O(1)
public class SelectionSort {
    static void selectionSortArray(int[] arr)
    {
        int n=arr.length;
        int min_idx;
        for (int i=0;i<n;i++)
        {
            min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
        int[] arr = {23,53,1,45,15};
        selectionSortArray(arr);
        printArray(arr);
    }
}
