/*2. Minimum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 4 (subarray [1, 3, 2])*/

public class SlidingWindow2{
	public static void main(String []args){
		int a[] = new int[]{2, 1, 5, 1, 3, 2};
		int k=3 , sum=0 , min;
		
		for(int i=0;i<k;i++){
			sum = sum + a[i];
		}
		
		min = sum;
		
		for(int i=k;i<a.length;i++){
			sum = sum + a[i] - a[i-k];
			if(sum < min){
				min = sum;
			}
		}
		System.out.println("Minimum Sum Subarray = "+min);
	}
}