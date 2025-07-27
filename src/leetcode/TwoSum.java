package leetcode;

import java.util.*;

public class TwoSum {
	static int[] indexOfTwoNum(int[] arr, int target)
	{
		Map<Integer,Integer> m = new HashMap<>();
		if (arr.length<2)
		{
			return new int[] {0,0};
		}
		for (int i=0;i<arr.length;i++)
		{
			if (m.containsKey(arr[i]))
			{
				return new int[] {m.get(arr[i]),i};
			}
			else
			{
				m.put(target-arr[i], i);
			}
		}
		return new int[] {0,0};
	}
	public static void main(String args[])
	{
		int[] a = {2,7,11,15};
		int target = 18;
		int[] res = indexOfTwoNum(a,target);
//		for (int i:res)
//		{
//			System.out.print("Index: "+i);
//		}
		System.out.println("Index:"+Arrays.toString(res));
	}
}
