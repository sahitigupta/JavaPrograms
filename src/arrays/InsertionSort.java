package arrays;
//t:O(n^2) s:O(1)
public class InsertionSort {
    static void insertionSortArray(int[] arr)
    {
        int n=arr.length;
        for (int i=1;i<n;i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
        insertionSortArray(arr);
        printArray(arr);
    }
}
