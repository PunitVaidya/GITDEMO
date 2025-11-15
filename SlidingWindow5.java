/*5. Longest Subarray with Sum K (positive numbers)
Example:
Input: arr = [4, 1, 1, 1, 2, 3, 5], K=5
Output: 4 (subarray [1,1,1,2])*/

public class SlidingWindow5
{   public static void main(String x[])
	{   
		int target=5;
		int a[]=new int[]{4, 1, 1, 1, 2, 3, 5};
		int sum=0,start=0;
		int maxLen=Integer.MIN_VALUE;
		for(int end=0; end<a.length; end++)
		{     sum = sum + a[end];
			while(sum>=target)
			{
				int clen = end-start+1;
				if(clen > maxLen)
				{
					maxLen=clen;
				}
				sum=sum-a[start];
				start++;
			}
		}
		int result=(maxLen==Integer.MIN_VALUE)?0:maxLen;
		System.out.println(result);
	}	
}
