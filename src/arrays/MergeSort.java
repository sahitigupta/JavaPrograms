package arrays;

public class MergeSort {
    static void merge(int[] arr, int l,int m,int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSortArray(int[] arr, int l, int r)
    {
        System.out.println("loop" + r);
        if (l<r)
        {
            int m = l + (r-l) / 2;
            mergeSortArray(arr, l, m);
            System.out.println("func 1");
            mergeSortArray(arr, m+1, r);
            System.out.println("func 2");
            merge(arr, l, m, r);
            System.out.println("merge");
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
        int[] a={38, 27, 43, 10 ,19};
        int n=a.length;
        mergeSortArray(a, 0, n-1);
        printArray(a);
    }
}
